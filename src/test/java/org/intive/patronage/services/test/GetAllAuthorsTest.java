  
package org.intive.patronage.services.test;

import java.io.IOException;

import org.intive.patronage.services.test.interfaces.IEmployee;
import org.intive.patronage.services.test.models.common.TestData;
import org.json.JSONException;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class GetAllAuthorsTest extends TestBase implements IEmployee {

    @DataProvider(name = "testData")
    public static Object[] provideTestData(final ITestContext context) {
        return provideTestData(GetAllAuthorsTest.class, context);
    }

    @Factory(dataProvider = "testData")
    public GetAllAuthorsTest(final TestData testData) {
        setTestClassObject(testData);
    }

    @Test()
    public void getEmployeeTest() throws IOException, JSONException {
        logTestNameToReporter();
        performTest();
    }
}