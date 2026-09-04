package com.google.api.services.youtube;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class YouTubeScopes {
    public static final String YOUTUBE = "https://www.googleapis.com/auth/youtube";
    public static final String YOUTUBEPARTNER = "https://www.googleapis.com/auth/youtubepartner";
    public static final String YOUTUBEPARTNER_CHANNEL_AUDIT = "https://www.googleapis.com/auth/youtubepartner-channel-audit";
    public static final String YOUTUBE_CHANNEL_MEMBERSHIPS_CREATOR = "https://www.googleapis.com/auth/youtube.channel-memberships.creator";
    public static final String YOUTUBE_FORCE_SSL = "https://www.googleapis.com/auth/youtube.force-ssl";
    public static final String YOUTUBE_READONLY = "https://www.googleapis.com/auth/youtube.readonly";
    public static final String YOUTUBE_UPLOAD = "https://www.googleapis.com/auth/youtube.upload";

    private YouTubeScopes() {
    }

    public static Set<String> all() {
        HashSet hashSet = new HashSet();
        hashSet.add(YOUTUBE);
        hashSet.add(YOUTUBE_CHANNEL_MEMBERSHIPS_CREATOR);
        hashSet.add(YOUTUBE_FORCE_SSL);
        hashSet.add(YOUTUBE_READONLY);
        hashSet.add(YOUTUBE_UPLOAD);
        hashSet.add(YOUTUBEPARTNER);
        hashSet.add(YOUTUBEPARTNER_CHANNEL_AUDIT);
        return Collections.unmodifiableSet(hashSet);
    }
}
