package Jabva8Qualis;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudentPortalTest {

	@InjectMocks
	StudentPortal mathApplication = new StudentPortal();
	
	@Mock
	DatabaseInterface databaseService;
	
	@Test
	public void testRetrieveStudentInfo() {
		//add the behavior to retrieve the name of student when student id is given
		when(databaseService.fetchStudentName(12)).thenReturn("Niva Abel");
		assertEquals(mathApplication.getStudentName(12), "Niva Abel");
	}
	
	@Test(expected = IllegalStateException.class)
	public void testSaveStudentInfoWithException() {
		//add behavior to show how we can mock exception being thrown
		when(databaseService.saveToDB(ArgumentMatchers.anyInt(), ArgumentMatchers.contains("test")))
			.thenThrow(new IllegalStateException("Database failure"));
		
		mathApplication.saveStudentInfo(15, "test");
	}
}



//clase a ser testeada
class StudentPortal {
		
		private DatabaseInterface calcService;
		
		public int saveStudentInfo(int stdID, String stdName) {
			return calcService.saveToDB(stdID, stdName);
		}
		
		public String getStudentName(int stdID) {
			return calcService.fetchStudentName(stdID);
		}
		
		public Map<Integer, String> getSavedStudentInfo() {
			return calcService.getSavedStudentDetails();
		}
	}
		

	
	
	
	
	


//Interface con los metodos de acceso a la base de datos
interface DatabaseInterface{
	public int saveToDB(int StdID, String stdName);
	public String fetchStudentName(int stdID);
	public Map<Integer, String> getSavedStudentDetails();
}



