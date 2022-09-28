package ekam.example.api;

import org.testng.annotations.DataProvider;

public class DataProviderForApi {

    public static final String AUTHORIZATION = "Bearer 066f8bad1975068983d833dc12167ea54e8ef6ae86dc181987bf748cbc932341";

    @DataProvider
    public Object[][] validUserIds() {
        return new Object[][] {{2311},{2312},{2313},{2314}};
    }
}
