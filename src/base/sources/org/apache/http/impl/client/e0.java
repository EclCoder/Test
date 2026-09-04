package org.apache.http.impl.client;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class e0 implements fo.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f49281b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f49282a = new f();

    @Override // fo.g
    public void a(eo.f fVar, eo.j jVar) {
        this.f49282a.a(fVar, jVar);
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f49281b = concurrentHashMap;
        Locale locale = Locale.ROOT;
        concurrentHashMap.put("Basic".toUpperCase(locale), "Basic");
        String str = HqKnbV.MlEgeg;
        concurrentHashMap.put(str.toUpperCase(locale), str);
        concurrentHashMap.put("NTLM".toUpperCase(locale), "NTLM");
        concurrentHashMap.put("Negotiate".toUpperCase(locale), "SPNEGO");
        concurrentHashMap.put("Kerberos".toUpperCase(locale), "Kerberos");
    }
}
