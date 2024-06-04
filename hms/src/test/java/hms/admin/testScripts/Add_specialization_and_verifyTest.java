package hms.admin.testScripts;

import org.testng.annotations.Test;

import generic.basetest.BaseClass;
import objectRepositoryUtility.AddDoctorSpecializationPage;
import objectRepositoryUtility.AdminLoginPage;
import objectRepositoryUtility.AdminPage;

public class Add_specialization_and_verifyTest extends BaseClass {

	@Test
	public void addSpecialization() throws Throwable {
		AdminLoginPage alp = new AdminLoginPage(driver);
		alp.loginToapp();
		AdminPage ap = new AdminPage(driver);
		ap.getDoctorDD().click();
		ap.getDoctorSpecializationLink().click();

		AddDoctorSpecializationPage asp = new AddDoctorSpecializationPage(driver);
		asp.addDoctorSpecialization();

	}
}
