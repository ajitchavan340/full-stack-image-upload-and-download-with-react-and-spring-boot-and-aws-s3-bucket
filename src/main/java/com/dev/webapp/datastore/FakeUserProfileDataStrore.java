package com.dev.webapp.datastore;

import com.dev.webapp.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStrore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("eb119f61-6a08-4c3a-a31f-3f28bf0c882f"),"ajit",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("ac5dc9bc-fe86-4623-89ed-87f51bc7437c"),"namrata",null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
