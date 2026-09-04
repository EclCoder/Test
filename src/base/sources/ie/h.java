package ie;

import android.content.Context;
import dd.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        String a(Object obj);
    }

    public static dd.c b(String str, String str2) {
        return dd.c.l(f.a(str, str2), f.class);
    }

    public static dd.c c(final String str, final a aVar) {
        return dd.c.m(f.class).b(q.j(Context.class)).e(new dd.g() { // from class: ie.g
            @Override // dd.g
            public final Object a(dd.d dVar) {
                return f.a(str, aVar.a((Context) dVar.a(Context.class)));
            }
        }).c();
    }
}
