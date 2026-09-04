package t6;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements z6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53149a = "video_reward_full";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53150b = "video_brand";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53151c = "video_splash";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f53152d = "video_default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f53153e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f53154f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f53155g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f53156h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f53157i = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file2.lastModified() - file.lastModified();
            if (jLastModified == 0) {
                return 0;
            }
            return jLastModified < 0 ? -1 : 1;
        }
    }

    private List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new z6.b(new File(hnj()).listFiles(), o6.a.j()));
        arrayList.add(new z6.b(new File(hn()).listFiles(), o6.a.d()));
        arrayList.add(new z6.b(new File(e()).listFiles(), o6.a.c()));
        arrayList.add(new z6.b(new File(qor()).listFiles(), o6.a.k()));
        return arrayList;
    }

    private Set c() {
        HashSet hashSet = new HashSet();
        for (r6.a aVar : r6.a.f51105e.values()) {
            if (aVar != null && aVar.d() != null) {
                com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVarD = aVar.d();
                hashSet.add(p6.a.a(cVarD.sk(), cVarD.uua()).getAbsolutePath());
                hashSet.add(p6.a.d(cVarD.sk(), cVarD.uua()).getAbsolutePath());
            }
        }
        for (s6.a aVar2 : s6.c.f51498a.values()) {
            if (aVar2 != null && aVar2.g() != null) {
                com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVarG = aVar2.g();
                hashSet.add(p6.a.a(cVarG.sk(), cVarG.uua()).getAbsolutePath());
                hashSet.add(p6.a.d(cVarG.sk(), cVarG.uua()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    private static void d(File[] fileArr, int i10, Set set) {
        if (i10 >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i10) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new a());
                    while (i10 < listAsList.size()) {
                        File file = (File) listAsList.get(i10);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i10)).delete();
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // z6.a
    public long a(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        if (TextUtils.isEmpty(cVar.sk()) || TextUtils.isEmpty(cVar.uua())) {
            return 0L;
        }
        return p6.a.b(cVar.sk(), cVar.uua());
    }

    public String e() {
        if (this.f53155g == null) {
            this.f53155g = this.f53153e + File.separator + this.f53150b;
            File file = new File(this.f53155g);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f53155g;
    }

    @Override // z6.a
    public synchronized void gjv() {
        try {
            Set setC = null;
            for (z6.b bVar : b()) {
                File[] fileArrB = bVar.b();
                if (fileArrB != null && fileArrB.length >= bVar.a()) {
                    if (setC == null) {
                        setC = c();
                    }
                    int iA = bVar.a() - 2;
                    if (iA < 0) {
                        iA = 0;
                    }
                    d(bVar.b(), iA, setC);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // z6.a
    public String hn() {
        if (this.f53156h == null) {
            this.f53156h = this.f53153e + File.separator + this.f53151c;
            File file = new File(this.f53156h);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f53156h;
    }

    @Override // z6.a
    public void hnj(String str) {
        this.f53153e = str;
    }

    @Override // z6.a
    public String qor() {
        if (this.f53157i == null) {
            this.f53157i = this.f53153e + File.separator + this.f53152d;
            File file = new File(this.f53157i);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f53157i;
    }

    @Override // z6.a
    public String hnj() {
        if (this.f53154f == null) {
            this.f53154f = this.f53153e + File.separator + this.f53149a;
            File file = new File(this.f53154f);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f53154f;
    }

    @Override // z6.a
    public boolean hnj(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        if (TextUtils.isEmpty(cVar.sk()) || TextUtils.isEmpty(cVar.uua())) {
            return false;
        }
        return new File(cVar.sk(), cVar.uua()).exists();
    }
}
