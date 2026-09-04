package com.google.api.client.googleapis.auth.oauth2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class SystemEnvironmentProvider {
    static final SystemEnvironmentProvider INSTANCE = new SystemEnvironmentProvider();

    SystemEnvironmentProvider() {
    }

    String getEnv(String str) {
        return System.getenv(str);
    }

    boolean getEnvEquals(String str, String str2) {
        return System.getenv().containsKey(str) && System.getenv(str).equals(str2);
    }
}
