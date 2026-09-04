package com.google.api.client.googleapis.testing;

import com.google.common.collect.l0;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import sc.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class TestUtils {
    private static final String UTF_8 = "UTF-8";

    private TestUtils() {
    }

    public static Map<String, String> parseQuery(String str) throws IOException {
        HashMap map = new HashMap();
        Iterator it = t.f('&').i(str).iterator();
        while (it.hasNext()) {
            ArrayList arrayListI = l0.i(t.f('=').i((String) it.next()));
            if (arrayListI.size() != 2) {
                throw new IOException("Invalid Query String");
            }
            map.put(URLDecoder.decode((String) arrayListI.get(0), "UTF-8"), URLDecoder.decode((String) arrayListI.get(1), "UTF-8"));
        }
        return map;
    }
}
