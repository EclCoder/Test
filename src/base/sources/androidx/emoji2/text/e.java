package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f3837o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f3838p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile e f3839q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f3841b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f3844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final h f3845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f3846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f3847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f3848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f3849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f3850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f3851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f3852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0037e f3853n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f3840a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f3842c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f3843d = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.h f3854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile m f3855c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0036a extends i {
            C0036a() {
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th2) {
                a.this.f3857a.n(th2);
            }

            @Override // androidx.emoji2.text.e.i
            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        void a() {
            try {
                this.f3857a.f3845f.a(new C0036a());
            } catch (Throwable th2) {
                this.f3857a.n(th2);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f3854b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.e.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3855c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3857a.f3847h);
        }

        void d(m mVar) {
            if (mVar == null) {
                this.f3857a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3855c = mVar;
            m mVar2 = this.f3855c;
            j jVar = this.f3857a.f3846g;
            InterfaceC0037e interfaceC0037e = this.f3857a.f3853n;
            e eVar = this.f3857a;
            this.f3854b = new androidx.emoji2.text.h(mVar2, jVar, interfaceC0037e, eVar.f3848i, eVar.f3849j, androidx.emoji2.text.g.a());
            this.f3857a.o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f3857a;

        b(e eVar) {
            this.f3857a = eVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        abstract void c(EditorInfo editorInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h f3858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j f3859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f3862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Set f3863f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f3864g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3865h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f3866i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        InterfaceC0037e f3867j = new androidx.emoji2.text.d();

        protected c(h hVar) {
            m0.g.h(hVar, "metadataLoader cannot be null.");
            this.f3858a = hVar;
        }

        protected final h a() {
            return this.f3858a;
        }

        public c b(int i10) {
            this.f3866i = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d implements j {
        @Override // androidx.emoji2.text.e.j
        public androidx.emoji2.text.i a(o oVar) {
            return new p(oVar);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0037e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f3868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f3869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3870c;

        g(f fVar, int i10) {
            this(Arrays.asList((f) m0.g.h(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3868a.size();
            int i10 = 0;
            if (this.f3870c != 1) {
                while (i10 < size) {
                    ((f) this.f3868a.get(i10)).a(this.f3869b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((f) this.f3868a.get(i10)).b();
                    i10++;
                }
            }
        }

        g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection collection, int i10, Throwable th2) {
            m0.g.h(collection, "initCallbacks cannot be null");
            this.f3868a = new ArrayList(collection);
            this.f3870c = i10;
            this.f3869b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface h {
        void a(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(m mVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface j {
        androidx.emoji2.text.i a(o oVar);
    }

    private e(c cVar) {
        this.f3847h = cVar.f3860c;
        this.f3848i = cVar.f3861d;
        this.f3849j = cVar.f3862e;
        this.f3850k = cVar.f3864g;
        this.f3851l = cVar.f3865h;
        this.f3845f = cVar.f3858a;
        this.f3852m = cVar.f3866i;
        this.f3853n = cVar.f3867j;
        androidx.collection.b bVar = new androidx.collection.b();
        this.f3841b = bVar;
        j jVar = cVar.f3859b;
        this.f3846g = jVar == null ? new d() : jVar;
        Set set = cVar.f3863f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f3863f);
        }
        this.f3844e = new a(this);
        m();
    }

    public static e c() {
        e eVar;
        synchronized (f3837o) {
            eVar = f3839q;
            m0.g.i(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.h.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.c(editable, i10, keyEvent);
    }

    public static e h(c cVar) {
        e eVar;
        e eVar2 = f3839q;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (f3837o) {
            try {
                eVar = f3839q;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f3839q = eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public static boolean i() {
        return f3839q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f3840a.writeLock().lock();
        try {
            if (this.f3852m == 0) {
                this.f3842c = 0;
            }
            this.f3840a.writeLock().unlock();
            if (e() == 0) {
                this.f3844e.a();
            }
        } catch (Throwable th2) {
            this.f3840a.writeLock().unlock();
            throw th2;
        }
    }

    public int d() {
        return this.f3851l;
    }

    public int e() {
        this.f3840a.readLock().lock();
        try {
            return this.f3842c;
        } finally {
            this.f3840a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f3850k;
    }

    public void l() {
        m0.g.i(this.f3852m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f3840a.writeLock().lock();
        try {
            if (this.f3842c == 0) {
                this.f3840a.writeLock().unlock();
                return;
            }
            this.f3842c = 0;
            this.f3840a.writeLock().unlock();
            this.f3844e.a();
        } catch (Throwable th2) {
            this.f3840a.writeLock().unlock();
            throw th2;
        }
    }

    void n(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f3840a.writeLock().lock();
        try {
            this.f3842c = 2;
            arrayList.addAll(this.f3841b);
            this.f3841b.clear();
            this.f3840a.writeLock().unlock();
            this.f3843d.post(new g(arrayList, this.f3842c, th2));
        } catch (Throwable th3) {
            this.f3840a.writeLock().unlock();
            throw th3;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f3840a.writeLock().lock();
        try {
            this.f3842c = 1;
            arrayList.addAll(this.f3841b);
            this.f3841b.clear();
            this.f3840a.writeLock().unlock();
            this.f3843d.post(new g(arrayList, this.f3842c));
        } catch (Throwable th2) {
            this.f3840a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        m0.g.i(k(), "Not initialized yet");
        m0.g.e(i10, "start cannot be negative");
        m0.g.e(i11, "end cannot be negative");
        m0.g.e(i12, "maxEmojiCount cannot be negative");
        m0.g.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        m0.g.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        m0.g.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f3847h : false;
        } else {
            z10 = true;
        }
        return this.f3844e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(f fVar) {
        m0.g.h(fVar, "initCallback cannot be null");
        this.f3840a.writeLock().lock();
        try {
            if (this.f3842c == 1 || this.f3842c == 2) {
                this.f3843d.post(new g(fVar, this.f3842c));
            } else {
                this.f3841b.add(fVar);
            }
        } finally {
            this.f3840a.writeLock().unlock();
        }
    }

    public void u(f fVar) {
        m0.g.h(fVar, "initCallback cannot be null");
        this.f3840a.writeLock().lock();
        try {
            this.f3841b.remove(fVar);
        } finally {
            this.f3840a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f3844e.c(editorInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class f {
        public void b() {
        }

        public void a(Throwable th2) {
        }
    }
}
