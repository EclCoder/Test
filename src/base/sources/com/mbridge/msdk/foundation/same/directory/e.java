package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f30544c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f30545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f30546b = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f30547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f30548b;

        public a(c cVar, File file) {
            this.f30548b = cVar;
            this.f30547a = file;
        }
    }

    private e(b bVar) {
        this.f30545a = bVar;
    }

    public static File a(c cVar) {
        try {
            if (b() == null || b().f30546b == null || b().f30546b.isEmpty()) {
                return null;
            }
            ArrayList<a> arrayList = b().f30546b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                a aVar = arrayList.get(i10);
                i10++;
                a aVar2 = aVar;
                if (aVar2.f30548b.equals(cVar)) {
                    return aVar2.f30547a;
                }
            }
            return null;
        } catch (Throwable th2) {
            q0.b("MBridgeDirManager", th2.getMessage(), th2);
            return null;
        }
    }

    public static String b(c cVar) {
        File fileA = a(cVar);
        if (fileA != null) {
            return fileA.getAbsolutePath();
        }
        return null;
    }

    public static synchronized e b() {
        try {
            if (f30544c == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                t0.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f30544c;
    }

    public static synchronized void a(b bVar) {
        if (f30544c == null) {
            f30544c = new e(bVar);
        }
    }

    public boolean a() {
        return a(this.f30545a.a());
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String strB;
        com.mbridge.msdk.foundation.same.directory.a aVarC = aVar.c();
        if (aVarC == null) {
            strB = aVar.b();
        } else {
            File fileA = a(aVarC.d());
            if (fileA == null) {
                return false;
            }
            strB = fileA.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(strB);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f30546b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> listA = aVar.a();
        if (listA != null) {
            Iterator<com.mbridge.msdk.foundation.same.directory.a> it = listA.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
