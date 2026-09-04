package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final StackTraceElement[] f11264g = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r5.e f11266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r5.a f11267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Class f11268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f11269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f11270f;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    private void a(Throwable th2, List list) {
        if (th2 instanceof GlideException) {
            Iterator it = ((GlideException) th2).g().iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), list);
            }
        } else if (th2 != null) {
            list.add(th2);
        }
    }

    private static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).j(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void j(Appendable appendable) {
        d(this, appendable);
        b(g(), new a(appendable));
    }

    public List g() {
        return this.f11265a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f11269e);
        sb2.append(this.f11268d != null ? ", " + this.f11268d : "");
        sb2.append(this.f11267c != null ? ", " + this.f11267c : "");
        sb2.append(this.f11266b != null ? ", " + this.f11266b : "");
        List<Throwable> listH = h();
        if (listH.isEmpty()) {
            return sb2.toString();
        }
        if (listH.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listH.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : listH) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public List h() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void i(String str) {
        List listH = h();
        int size = listH.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) listH.get(i10));
            i10 = i11;
        }
    }

    void k(r5.e eVar, r5.a aVar) {
        l(eVar, aVar, null);
    }

    void l(r5.e eVar, r5.a aVar, Class cls) {
        this.f11266b = eVar;
        this.f11267c = aVar;
        this.f11268d = cls;
    }

    public void m(Exception exc) {
        this.f11270f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th2) {
        this(str, Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        j(printStream);
    }

    public GlideException(String str, List list) {
        this.f11269e = str;
        setStackTrace(f11264g);
        this.f11265a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        j(printWriter);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f11271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11272b = true;

        a(Appendable appendable) {
            this.f11271a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f11272b) {
                this.f11272b = false;
                this.f11271a.append("  ");
            }
            this.f11272b = c10 == '\n';
            this.f11271a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z10 = false;
            if (this.f11272b) {
                this.f11272b = false;
                this.f11271a.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f11272b = z10;
            this.f11271a.append(charSequenceA, i10, i11);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
