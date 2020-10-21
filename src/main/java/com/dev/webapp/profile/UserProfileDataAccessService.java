package com.dev.webapp.profile;

import com.dev.webapp.datastore.FakeUserProfileDataStrore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final FakeUserProfileDataStrore fakeUserProfileDataStrore;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDataStrore fakeUserProfileDataStrore) {
        this.fakeUserProfileDataStrore = fakeUserProfileDataStrore;
    }

    List<UserProfile> getUserProfiles() {
        return fakeUserProfileDataStrore.getUserProfiles();
    }
}