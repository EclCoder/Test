package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f41577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Throwable f41579c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static abstract class b {
        b() {
        }

        abstract void a(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintStream f41580a;

        c(PrintStream printStream) {
            this.f41580a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        void a(Object obj) {
            this.f41580a.println(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PrintWriter f41581a;

        d(PrintWriter printWriter) {
            this.f41581a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        void a(Object obj) {
            this.f41581a.println(obj);
        }
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private List e(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th2.getCause();
        if (cause != null && cause != th2) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    private void h(b bVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th2 : this.f41577a) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th2, "\t");
            i10++;
        }
        bVar.a(sb2.toString());
    }

    public List d() {
        return this.f41577a;
    }

    Throwable g(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause == null || th2 == cause) {
            return th2;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.f41579c == null) {
                a aVar = new a();
                HashSet hashSet = new HashSet();
                Throwable thG = aVar;
                for (Throwable runtimeException : this.f41577a) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        for (Throwable th2 : e(runtimeException)) {
                            if (hashSet.contains(th2)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            thG.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        thG = g(thG);
                    }
                }
                this.f41579c = aVar;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f41579c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f41578b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(new c(printStream));
    }

    private void a(StringBuilder sb2, Throwable th2, String str) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th2.getCause(), SVWsZyNSAChGIA.UmNlqhwLRI);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(new d(printWriter));
    }

    public CompositeException(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).d());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f41577a = listUnmodifiableList;
            this.f41578b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
