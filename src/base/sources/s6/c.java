package s6;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f51498a = new ConcurrentHashMap();

    public static synchronized void a(Context context, com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar, a7.b.a aVar) {
        if (cVar == null) {
            return;
        }
        try {
            ConcurrentHashMap concurrentHashMap = f51498a;
            a aVar2 = (a) concurrentHashMap.get(cVar.uua());
            if (aVar2 == null) {
                aVar2 = new a(context, cVar);
                concurrentHashMap.put(cVar.uua(), aVar2);
                cVar.dkl();
                cVar.uua();
            }
            aVar2.i(aVar);
            cVar.dkl();
            cVar.uua();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void b(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        try {
            a aVar = (a) f51498a.remove(cVar.uua());
            if (aVar != null) {
                aVar.p(true);
            }
            cVar.dkl();
            cVar.uua();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
