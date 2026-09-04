package jd;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f42338d = new FilenameFilter() { // from class: jd.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator f42339e = new Comparator() { // from class: jd.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd.j f42340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42341b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42342c = null;

    l(pd.j jVar) {
        this.f42340a = jVar;
    }

    private static void d(pd.j jVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            jVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            gd.g.f().l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    static String e(pd.j jVar, String str) {
        List listR = jVar.r(str, f42338d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f42339e)).getName().substring(4);
        }
        gd.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f42341b, str)) {
            return this.f42342c;
        }
        return e(this.f42340a, str);
    }

    public synchronized void f(String str) {
        if (!Objects.equals(this.f42342c, str)) {
            d(this.f42340a, this.f42341b, str);
            this.f42342c = str;
        }
    }

    public synchronized void g(String str) {
        if (!Objects.equals(this.f42341b, str)) {
            d(this.f42340a, str, this.f42342c);
            this.f42341b = str;
        }
    }
}
