package a2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f94a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f95b = new ArrayList();

    private e a(String str, Object obj) {
        this.f94a.put((String) w1.a.e(str), w1.a.e(obj));
        this.f95b.remove(str);
        return this;
    }

    public static e g(e eVar, long j10) {
        return eVar.e("exo_len", j10);
    }

    public Map b() {
        HashMap map = new HashMap(this.f94a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List c() {
        return Collections.unmodifiableList(new ArrayList(this.f95b));
    }

    public e d(String str) {
        this.f95b.add(str);
        this.f94a.remove(str);
        return this;
    }

    public e e(String str, long j10) {
        return a(str, Long.valueOf(j10));
    }

    public e f(String str, String str2) {
        return a(str, str2);
    }

    public static e h(e eVar, Uri uri) {
        String str = Saucuwx.dlZk;
        return uri == null ? eVar.d(str) : eVar.f(str, uri.toString());
    }
}
