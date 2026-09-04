package oh;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.google.android.gms.ads.RequestConfiguration;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.xiaopo.flying.sticker.StickerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import tf.i7;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001+\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Loh/m4;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfl/g0;", "E", "K", "J", "", "text", "I", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Luh/q0;", "a", "Lfl/k;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()Luh/q0;", "textSettingsViewModel", "Luh/y;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "F", "()Luh/y;", "mainViewModel", "Ltf/i7;", "c", "Ltf/i7;", "binding", "Lbk/l;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lbk/l;", "sticker", "oh/m4$k", "e", "Loh/m4$k;", "stickerListener", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m4 extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private i7 binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private bk.l sticker;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fl.k textSettingsViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.q0.class), new e(this), new f(null, this), new g(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fl.k mainViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.y.class), new h(this), new i(null, this), new j(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k stickerListener = new k();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f48739r;

        /* JADX INFO: renamed from: oh.m4$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0751a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f48741r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f48742s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ m4 f48743t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0751a(m4 m4Var, kl.f fVar) {
                super(2, fVar);
                this.f48743t = m4Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, kl.f fVar) {
                return ((C0751a) create(str, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                C0751a c0751a = new C0751a(this.f48743t, fVar);
                c0751a.f48742s = obj;
                return c0751a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f48741r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                this.f48743t.I((String) this.f48742s);
                this.f48743t.J();
                return fl.g0.f38750a;
            }
        }

        a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return m4.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f48739r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.z zVarO = m4.this.G().o();
                C0751a c0751a = new C0751a(m4.this, null);
                kotlin.jvm.internal.s.f(zVarO, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f48739r = 1;
                if (hm.g.i(zVarO, c0751a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f48744r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f48746r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ m4 f48747s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m4 m4Var, kl.f fVar) {
                super(2, fVar);
                this.f48747s = m4Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(fl.g0 g0Var, kl.f fVar) {
                return ((a) create(g0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f48747s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f48746r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                this.f48747s.J();
                return fl.g0.f38750a;
            }
        }

        b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return m4.this.new b(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f48744r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.z zVarM = m4.this.G().m();
                a aVar = new a(m4.this, null);
                kotlin.jvm.internal.s.f(zVarM, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f48744r = 1;
                if (hm.g.i(zVarM, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f48748r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f48750r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ m4 f48751s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m4 m4Var, kl.f fVar) {
                super(2, fVar);
                this.f48751s = m4Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(fl.g0 g0Var, kl.f fVar) {
                return ((a) create(g0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f48751s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f48750r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                this.f48751s.E();
                this.f48751s.J();
                return fl.g0.f38750a;
            }
        }

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return m4.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f48748r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.z zVarN = m4.this.G().n();
                a aVar = new a(m4.this, null);
                kotlin.jvm.internal.s.f(zVarN, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f48748r = 1;
                if (hm.g.i(zVarN, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class d implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f48752a;

        d(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f48752a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f48752a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f48752a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class e extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48753a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f48753a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48753a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class f extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48755b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48754a = aVar;
            this.f48755b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48754a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48755b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class g extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48756a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f48756a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48756a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class h extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48757a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f48757a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48757a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class i extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48759b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48758a = aVar;
            this.f48759b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48758a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48759b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class j extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48760a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f48760a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48760a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class k implements StickerView.b {
        k() {
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void a(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void b(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void c(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void d(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void e(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void f(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void g(bk.h sticker) {
            y3.g0 g0VarW;
            androidx.fragment.app.f0 supportFragmentManager;
            kotlin.jvm.internal.s.h(sticker, "sticker");
            androidx.fragment.app.s activity = m4.this.getActivity();
            NavHostFragment navHostFragment = (NavHostFragment) ((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.j0(R.id.nav_host_fragment));
            if (navHostFragment == null || (g0VarW = navHostFragment.w()) == null) {
                return;
            }
            g0VarW.L();
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void h(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void i(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        qh.j jVarT = G().t();
        if (jVarT == null) {
            return;
        }
        F().N1(jVarT);
        if (jVarT.x()) {
            F().L1(jVarT.c());
        }
    }

    private final uh.y F() {
        return (uh.y) this.mainViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uh.q0 G() {
        return (uh.q0) this.textSettingsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(m4 m4Var) {
        m4Var.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String text) {
        bk.l lVar;
        qh.j jVarT = G().t();
        if (jVarT != null) {
            jVarT.G(text);
            Object objF = G().s().f();
            kotlin.jvm.internal.s.e(objF);
            jVarT.B((og.a) objF);
            Object objF2 = G().q().f();
            kotlin.jvm.internal.s.e(objF2);
            jVarT.z(((Number) objF2).intValue());
            Object objF3 = G().r().f();
            kotlin.jvm.internal.s.e(objF3);
            jVarT.A(((Number) objF3).floatValue());
            Object objF4 = G().p().f();
            kotlin.jvm.internal.s.e(objF4);
            jVarT.y((Layout.Alignment) objF4);
            Object objF5 = G().w().f();
            kotlin.jvm.internal.s.e(objF5);
            jVarT.F(((Number) objF5).floatValue());
            Object objF6 = G().u().f();
            kotlin.jvm.internal.s.e(objF6);
            jVarT.D(((Number) objF6).floatValue());
            Object objF7 = G().v().f();
            kotlin.jvm.internal.s.e(objF7);
            jVarT.E(((Number) objF7).floatValue());
            bk.l lVar2 = this.sticker;
            if (lVar2 == null) {
                kotlin.jvm.internal.s.w("sticker");
                lVar2 = null;
            }
            jVarT.l(lVar2.m());
            bk.l lVar3 = this.sticker;
            if (lVar3 == null) {
                kotlin.jvm.internal.s.w("sticker");
                lVar3 = null;
            }
            jVarT.H(lVar3.p());
            bk.l lVar4 = this.sticker;
            if (lVar4 == null) {
                kotlin.jvm.internal.s.w("sticker");
                lVar = null;
            } else {
                lVar = lVar4;
            }
            jVarT.C(lVar.i());
            return;
        }
        uh.q0 q0VarG = G();
        Object objF8 = G().s().f();
        kotlin.jvm.internal.s.e(objF8);
        og.a aVar = (og.a) objF8;
        Object objF9 = G().q().f();
        kotlin.jvm.internal.s.e(objF9);
        int iIntValue = ((Number) objF9).intValue();
        Object objF10 = G().r().f();
        kotlin.jvm.internal.s.e(objF10);
        float fFloatValue = ((Number) objF10).floatValue();
        Object objF11 = G().p().f();
        kotlin.jvm.internal.s.e(objF11);
        Layout.Alignment alignment = (Layout.Alignment) objF11;
        Object objF12 = G().w().f();
        kotlin.jvm.internal.s.e(objF12);
        float fFloatValue2 = ((Number) objF12).floatValue();
        Object objF13 = G().u().f();
        kotlin.jvm.internal.s.e(objF13);
        float fFloatValue3 = ((Number) objF13).floatValue();
        Object objF14 = G().v().f();
        kotlin.jvm.internal.s.e(objF14);
        float fFloatValue4 = ((Number) objF14).floatValue();
        bk.l lVar5 = this.sticker;
        if (lVar5 == null) {
            kotlin.jvm.internal.s.w("sticker");
            lVar5 = null;
        }
        Matrix matrixM = lVar5.m();
        bk.l lVar6 = this.sticker;
        if (lVar6 == null) {
            kotlin.jvm.internal.s.w("sticker");
            lVar6 = null;
        }
        int iP = lVar6.p();
        bk.l lVar7 = this.sticker;
        if (lVar7 == null) {
            kotlin.jvm.internal.s.w("sticker");
            lVar7 = null;
        }
        int i10 = lVar7.i();
        i7 i7Var = this.binding;
        if (i7Var == null) {
            kotlin.jvm.internal.s.w("binding");
            i7Var = null;
        }
        float width = i7Var.B().getWidth();
        i7 i7Var2 = this.binding;
        if (i7Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
            i7Var2 = null;
        }
        float height = i7Var2.B().getHeight();
        Object objF15 = F().X0().f();
        kotlin.jvm.internal.s.e(objF15);
        q0VarG.B(new qh.j(null, text, aVar, iIntValue, fFloatValue, alignment, fFloatValue2, fFloatValue3, fFloatValue4, matrixM, iP, i10, width, height, ((Number) objF15).longValue(), 0L, false, 0, 0.0f, 491521, null));
        uh.y yVarF = F();
        qh.j jVarT2 = G().t();
        kotlin.jvm.internal.s.e(jVarT2);
        yVarF.a0(jVarT2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        getParentFragmentManager().q().n(this).g();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void K() {
        wp.a.a("Setup text settings overlay", new Object[0]);
        qh.j jVarT = G().t();
        bk.l lVar = null;
        i7 i7Var = null;
        if (jVarT != null) {
            i7 i7Var2 = this.binding;
            if (i7Var2 == null) {
                kotlin.jvm.internal.s.w("binding");
                i7Var2 = null;
            }
            StickerView stickerView = i7Var2.A;
            kotlin.jvm.internal.s.g(stickerView, "stickerView");
            i7 i7Var3 = this.binding;
            if (i7Var3 == null) {
                kotlin.jvm.internal.s.w("binding");
                i7Var3 = null;
            }
            float width = i7Var3.B().getWidth();
            i7 i7Var4 = this.binding;
            if (i7Var4 == null) {
                kotlin.jvm.internal.s.w("binding");
            } else {
                i7Var = i7Var4;
            }
            bk.h hVarC = sh.b.c(stickerView, jVarT, width, i7Var.B().getHeight());
            kotlin.jvm.internal.s.f(hVarC, "null cannot be cast to non-null type com.xiaopo.flying.sticker.TextSticker");
            this.sticker = (bk.l) hVarC;
            G().x().q(jVarT.d());
        } else {
            this.sticker = new bk.l(requireContext(), getString(R.string.enter_text)).G(12.0f).z(0.0f).I();
            i7 i7Var5 = this.binding;
            if (i7Var5 == null) {
                kotlin.jvm.internal.s.w("binding");
                i7Var5 = null;
            }
            StickerView stickerView2 = i7Var5.A;
            bk.l lVar2 = this.sticker;
            if (lVar2 == null) {
                kotlin.jvm.internal.s.w("sticker");
            } else {
                lVar = lVar2;
            }
            stickerView2.b(lVar);
            G().x().q(getString(R.string.enter_text));
        }
        G().x().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.e4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.O(this.f48654a, (String) obj);
            }
        }));
        G().s().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.f4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.P(this.f48660a, (og.a) obj);
            }
        }));
        G().q().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.g4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.Q(this.f48670a, (Integer) obj);
            }
        }));
        G().r().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.h4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.R(this.f48693a, (Float) obj);
            }
        }));
        G().w().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.i4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.S(this.f48700a, (Float) obj);
            }
        }));
        G().p().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.j4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.L(this.f48706a, (Layout.Alignment) obj);
            }
        }));
        G().u().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.k4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.M(this.f48711a, (Float) obj);
            }
        }));
        G().v().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.l4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m4.N(this.f48728a, (Float) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 L(m4 m4Var, Layout.Alignment alignment) {
        bk.l lVar = m4Var.sticker;
        i7 i7Var = null;
        if (lVar == null) {
            kotlin.jvm.internal.s.w("sticker");
            lVar = null;
        }
        lVar.E(alignment).I();
        i7 i7Var2 = m4Var.binding;
        if (i7Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            i7Var = i7Var2;
        }
        i7Var.A.invalidate();
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 M(m4 m4Var, Float f10) {
        bk.l lVar = m4Var.sticker;
        i7 i7Var = null;
        if (lVar == null) {
            kotlin.jvm.internal.s.w("sticker");
            lVar = null;
        }
        kotlin.jvm.internal.s.e(f10);
        lVar.z(f10.floatValue()).I();
        i7 i7Var2 = m4Var.binding;
        if (i7Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            i7Var = i7Var2;
        }
        i7Var.A.invalidate();
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 N(m4 m4Var, Float f10) {
        bk.l lVar = m4Var.sticker;
        i7 i7Var = null;
        if (lVar == null) {
            kotlin.jvm.internal.s.w("sticker");
            lVar = null;
        }
        kotlin.jvm.internal.s.e(f10);
        lVar.A(f10.floatValue()).I();
        i7 i7Var2 = m4Var.binding;
        if (i7Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            i7Var = i7Var2;
        }
        i7Var.A.invalidate();
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 P(m4 m4Var, og.a aVar) {
        if (aVar != null) {
            bk.l lVar = m4Var.sticker;
            i7 i7Var = null;
            if (lVar == null) {
                kotlin.jvm.internal.s.w("sticker");
                lVar = null;
            }
            lVar.H(Typeface.createFromFile(aVar.b())).I();
            i7 i7Var2 = m4Var.binding;
            if (i7Var2 == null) {
                kotlin.jvm.internal.s.w("binding");
            } else {
                i7Var = i7Var2;
            }
            i7Var.A.invalidate();
        }
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 Q(m4 m4Var, Integer num) {
        wp.a.a("Text color changed " + num, new Object[0]);
        bk.l lVar = m4Var.sticker;
        i7 i7Var = null;
        if (lVar == null) {
            kotlin.jvm.internal.s.w("sticker");
            lVar = null;
        }
        kotlin.jvm.internal.s.e(num);
        lVar.F(num.intValue());
        Float f10 = (Float) m4Var.G().r().f();
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            bk.l lVar2 = m4Var.sticker;
            if (lVar2 == null) {
                kotlin.jvm.internal.s.w("sticker");
                lVar2 = null;
            }
            lVar2.B(fFloatValue);
        }
        i7 i7Var2 = m4Var.binding;
        if (i7Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            i7Var = i7Var2;
        }
        i7Var.A.invalidate();
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 R(m4 m4Var, Float f10) {
        bk.l lVar = m4Var.sticker;
        i7 i7Var = null;
        if (lVar == null) {
            kotlin.jvm.internal.s.w("sticker");
            lVar = null;
        }
        kotlin.jvm.internal.s.e(f10);
        lVar.B(f10.floatValue());
        i7 i7Var2 = m4Var.binding;
        if (i7Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            i7Var = i7Var2;
        }
        i7Var.A.invalidate();
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 S(m4 m4Var, Float f10) {
        bk.l lVar = m4Var.sticker;
        i7 i7Var = null;
        if (lVar == null) {
            kotlin.jvm.internal.s.w("sticker");
            lVar = null;
        }
        kotlin.jvm.internal.s.e(f10);
        lVar.G(f10.floatValue()).I();
        i7 i7Var2 = m4Var.binding;
        if (i7Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            i7Var = i7Var2;
        }
        i7Var.A.invalidate();
        return fl.g0.f38750a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        this.binding = i7.Y(inflater, container, false);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
        i7 i7Var = this.binding;
        i7 i7Var2 = null;
        if (i7Var == null) {
            kotlin.jvm.internal.s.w("binding");
            i7Var = null;
        }
        StickerView stickerView = i7Var.A;
        kotlin.jvm.internal.s.g(stickerView, "stickerView");
        sh.b.C(contextRequireContext, stickerView, false);
        i7 i7Var3 = this.binding;
        if (i7Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            i7Var2 = i7Var3;
        }
        View viewB = i7Var2.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        i7 i7Var = this.binding;
        if (i7Var == null) {
            kotlin.jvm.internal.s.w("binding");
            i7Var = null;
        }
        i7Var.A.F(this.stickerListener);
        i7 i7Var2 = this.binding;
        if (i7Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
            i7Var2 = null;
        }
        i7Var2.B().post(new Runnable() { // from class: oh.d4
            @Override // java.lang.Runnable
            public final void run() {
                m4.H(this.f48647a);
            }
        });
        androidx.lifecycle.b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.c0.a(viewLifecycleOwner).d(new a(null));
        androidx.lifecycle.b0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        androidx.lifecycle.c0.a(viewLifecycleOwner2).d(new b(null));
        androidx.lifecycle.b0 viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        androidx.lifecycle.c0.a(viewLifecycleOwner3).d(new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 O(m4 m4Var, String str) {
        bk.l lVar = m4Var.sticker;
        String str2 = UHbHibBvYxKnPE.BRdpeTXGs;
        i7 i7Var = null;
        if (lVar == null) {
            kotlin.jvm.internal.s.w(str2);
            lVar = null;
        }
        lVar.D(str);
        bk.l lVar2 = m4Var.sticker;
        if (lVar2 == null) {
            kotlin.jvm.internal.s.w(str2);
            lVar2 = null;
        }
        lVar2.I();
        i7 i7Var2 = m4Var.binding;
        if (i7Var2 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            i7Var = i7Var2;
        }
        i7Var.A.invalidate();
        return fl.g0.f38750a;
    }
}
