package com.cts.training.test;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.training.bean.Company;
import com.cts.training.bean.User;
import com.cts.training.dao.CompanyDAO;
public class CompanyUnitTest {
	private static  AnnotationConfigApplicationContext context;
	private static CompanyDAO companyDAO;
	private static Company company;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		company =(Company) context.getBean("company");
		companyDAO =(CompanyDAO) context.getBean("companyDAO");
	}

	
	/*
	 * @Test(expected = NullPointerException.class) public void test_update_user() {
	 * Company r=companyDAO.getCompanyById(1); r.setName("CTS");
	 * assertEquals(true,companyDAO.updateCompany(r)); }
	 */
	
//	@Test
//	public void testGetAllCompanies() {
//		List<Company> companies=companyDAO.getAllCompanies();
//		assertEquals(1,companies.size());
//		//fail("Not yet implemented");
//	}
//	
//	
//					
	@Test()
	public void test_save_company_success() {
		Company c=new Company(78,"akhil",456.78,"IT","bRAIN");
		assertEquals(true,companyDAO.saveorUpdateCompany(c));
	}
}