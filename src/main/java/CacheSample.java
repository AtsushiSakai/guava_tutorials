import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import javax.annotation.Nonnull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CacheSample {

    public static void main(String[] args) {
        LoadingCache<String, Integer> employeeCache =
                CacheBuilder.newBuilder()
                        .maximumSize(100)                             // maximum 100 records can be cached
                        .expireAfterAccess(30, TimeUnit.MINUTES)      // cache will expire after 30 minutes of access
                        .build(new CacheLoader<String, Integer>() {  // build the cacheloader

                            @Override
                            public Integer load(@Nonnull String id) {
                                return getFromDatabase(id);
                            }
                        });

        try {
            System.out.println("Get data #1");
            System.out.println(employeeCache.get("100"));
            System.out.println(employeeCache.get("103"));
            System.out.println(employeeCache.get("110"));
            // Get data #1
            // Get data from database
            // 100
            // Get data from database
            // 103
            // Get data from database
            // 110

            System.out.println("GetData #2");
            System.out.println(employeeCache.get("100"));
            System.out.println(employeeCache.get("103"));
            System.out.println(employeeCache.get("110"));
            // GetData #2
            // 100
            // 103
            // 110

        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    static int getFromDatabase(String id){
        System.out.println("Get data from database");
        return Integer.parseInt(id);
    }
}
