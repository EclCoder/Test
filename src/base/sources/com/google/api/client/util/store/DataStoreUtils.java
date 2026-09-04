package com.google.api.client.util.store;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class DataStoreUtils {
    private DataStoreUtils() {
    }

    public static String toString(DataStore<?> dataStore) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('{');
            boolean z10 = true;
            for (String str : dataStore.keySet()) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append('=');
                sb2.append(dataStore.get(str));
            }
            sb2.append('}');
            return sb2.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
