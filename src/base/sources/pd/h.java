package pd;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.AppMeasurement;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import jd.j0;
import jd.m;
import ld.o;
import md.h0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f50004e = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f50005f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final nd.j f50006g = new nd.j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f50007h = new Comparator() { // from class: pd.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f50008i = new FilenameFilter() { // from class: pd.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(NotificationCompat.CATEGORY_EVENT);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f50009a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f50010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rd.j f50011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f50012d;

    public h(j jVar, rd.j jVar2, m mVar) {
        this.f50010b = jVar;
        this.f50011c = jVar2;
        this.f50012d = mVar;
    }

    private static String D(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f50004e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private void E(File file, h0.d dVar, String str, h0.a aVar) {
        String strD = this.f50012d.d(str);
        try {
            nd.j jVar = f50006g;
            I(this.f50010b.i(str), jVar.Q(jVar.P(D(file)).u(dVar).q(aVar).p(strD)));
        } catch (IOException e10) {
            gd.g.f().l("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void F(String str, long j10) {
        boolean z10;
        List listR = this.f50010b.r(str, f50008i);
        if (listR.isEmpty()) {
            gd.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        Iterator it = listR.iterator();
        loop0: while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File file = (File) it.next();
                try {
                    arrayList.add(k(str, f50006g.j(D(file))));
                    if (z10 || w(file.getName())) {
                        z10 = true;
                    }
                } catch (IOException e10) {
                    gd.g.f().l("Could not add event to report for " + file, e10);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            G(this.f50010b.q(str, "report"), arrayList, j10, z10, o.k(str, this.f50010b), this.f50012d.d(str));
        } else {
            gd.g.f().k("Could not parse event files for session " + str);
        }
    }

    private void G(File file, List list, long j10, boolean z10, String str, String str2) {
        try {
            nd.j jVar = f50006g;
            h0 h0VarR = jVar.P(D(file)).v(j10, z10, str).p(str2).r(list);
            h0.f fVarN = h0VarR.n();
            if (fVarN == null) {
                return;
            }
            gd.g.f().b("appQualitySessionId: " + str2);
            I(z10 ? this.f50010b.l(fVarN.i()) : this.f50010b.n(fVarN.i()), jVar.Q(h0VarR));
        } catch (IOException e10) {
            gd.g.f().l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int H(String str, int i10) {
        List listR = this.f50010b.r(str, new FilenameFilter() { // from class: pd.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return h.x(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: pd.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h.z((File) obj, (File) obj2);
            }
        });
        return h(listR, i10);
    }

    private static void I(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f50004e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void J(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f50004e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(j(j10));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ Optional a(File file) {
        try {
            return Optional.of(f50006g.N(D(file)));
        } catch (IOException e10) {
            gd.g.f().l("Unable to read the Profiling Manager file ", e10);
            return Optional.empty();
        }
    }

    private SortedSet g(String str) {
        this.f50010b.d();
        SortedSet sortedSetS = s();
        if (str != null) {
            sortedSetS.remove(str);
        }
        if (sortedSetS.size() > 8) {
            while (sortedSetS.size() > 8) {
                String str2 = (String) sortedSetS.last();
                gd.g.f().b("Removing session over cap: " + str2);
                this.f50010b.e(str2);
                sortedSetS.remove(str2);
            }
        }
        return sortedSetS;
    }

    private static int h(List list, int i10) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i10) {
                break;
            }
            j.u(file);
            size--;
        }
        return size;
    }

    private void i() {
        int i10 = this.f50011c.b().f51283a.f51295b;
        List listQ = q();
        int size = listQ.size();
        if (size <= i10) {
            return;
        }
        Iterator it = listQ.subList(i10, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static long j(long j10) {
        return j10 * 1000;
    }

    private h0.f.d k(String str, final h0.f.d dVar) {
        return (Build.VERSION.SDK_INT < 37 || !v(dVar)) ? dVar : (h0.f.d) Optional.of(this.f50010b.q(str, "profiling-manager-info")).filter(new Predicate() { // from class: pd.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((File) obj).exists();
            }
        }).flatMap(new Function() { // from class: pd.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return h.a((File) obj);
            }
        }).map(new Function() { // from class: pd.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                h0.f.d dVar2 = dVar;
                return dVar2.h().b(dVar2.b().i().f(dVar2.b().f().h().e((h0.e) obj).a()).a()).a();
            }
        }).orElse(dVar);
    }

    private void m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static String p(int i10, boolean z10) {
        return NotificationCompat.CATEGORY_EVENT + String.format(Locale.US, "%010d", Integer.valueOf(i10)) + (z10 ? "_" : "");
    }

    private List q() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f50010b.m());
        arrayList.addAll(this.f50010b.j());
        Comparator comparator = f50007h;
        Collections.sort(arrayList, comparator);
        List listO = this.f50010b.o();
        Collections.sort(listO, comparator);
        arrayList.addAll(listO);
        return arrayList;
    }

    private static String r(String str) {
        return str.substring(0, f50005f);
    }

    private static boolean v(h0.f.d dVar) {
        return dVar.g().equals(AppMeasurement.CRASH_ORIGIN) || dVar.g().equals("ndk-crash");
    }

    private static boolean w(String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT) && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x(File file, String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int z(File file, File file2) {
        return r(file.getName()).compareTo(r(file2.getName()));
    }

    public void A(h0.f.d dVar, String str, boolean z10) {
        int i10 = this.f50011c.b().f51283a.f51294a;
        try {
            I(this.f50010b.q(str, p(this.f50009a.getAndIncrement(), z10)), f50006g.k(dVar));
        } catch (IOException e10) {
            gd.g.f().l("Could not persist event for session " + str, e10);
        }
        H(str, i10);
    }

    public void B(h0.e eVar, String str) {
        try {
            I(this.f50010b.q(str, "profiling-manager-info"), f50006g.O(eVar));
        } catch (IOException e10) {
            gd.g.f().l("Could not persist Profiling Manager info " + str, e10);
        }
    }

    public void C(h0 h0Var) {
        h0.f fVarN = h0Var.n();
        if (fVarN == null) {
            gd.g.f().b("Could not get session for report");
            return;
        }
        String strI = fVarN.i();
        try {
            I(this.f50010b.q(strI, "report"), f50006g.Q(h0Var));
            J(this.f50010b.q(strI, "start-time"), "", fVarN.l());
        } catch (IOException e10) {
            gd.g.f().c("Could not persist report for session " + strI, e10);
        }
    }

    public void l() {
        m(this.f50010b.o());
        m(this.f50010b.m());
        m(this.f50010b.j());
    }

    public void n(String str, long j10) {
        for (String str2 : g(str)) {
            gd.g.f().i("Finalizing report for session " + str2);
            F(str2, j10);
            this.f50010b.e(str2);
        }
        i();
    }

    public void o(String str, h0.d dVar, h0.a aVar) {
        File fileQ = this.f50010b.q(str, "report");
        gd.g.f().b("Writing native session report for " + str + " to file: " + fileQ);
        E(fileQ, dVar, str, aVar);
    }

    public SortedSet s() {
        return new TreeSet(this.f50010b.f()).descendingSet();
    }

    public long t(String str) {
        return this.f50010b.q(str, "start-time").lastModified();
    }

    public boolean u() {
        return (this.f50010b.o().isEmpty() && this.f50010b.m().isEmpty() && this.f50010b.j().isEmpty()) ? false : true;
    }

    public List y() {
        List<File> listQ = q();
        ArrayList arrayList = new ArrayList();
        for (File file : listQ) {
            try {
                arrayList.add(j0.a(f50006g.P(D(file)), file.getName(), file));
            } catch (IOException e10) {
                gd.g.f().l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }
}
