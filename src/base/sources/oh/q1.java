package oh;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.ads.RequestConfiguration;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Loh/q1;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfl/g0;", "B", "E", "", "width", "height", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(FF)V", "Lqh/h;", "ratioItem", "F", "(Lqh/h;)V", "C", "D", "Landroid/graphics/RectF;", "rectF", "H", "(Landroid/graphics/RectF;)V", "w", "", "cropId", "A", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Luh/j;", "a", "Lfl/k;", "x", "()Luh/j;", "cropViewModel", "Luh/y;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "y", "()Luh/y;", "mainViewModel", "Ltf/s3;", "c", "Ltf/s3;", "binding", "Lng/d;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lng/d;", MimeTypes.BASE_TYPE_VIDEO, "Lcom/theartofdev/edmodo/cropper/f;", "e", "Lcom/theartofdev/edmodo/cropper/f;", "options", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q1 extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private tf.s3 binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ng.d video;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fl.k cropViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.j.class), new d(this), new e(null, this), new f(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fl.k mainViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.y.class), new g(this), new h(null, this), new i(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final com.theartofdev.edmodo.cropper.f options = new com.theartofdev.edmodo.cropper.f();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f48788r;

        /* JADX INFO: renamed from: oh.q1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0752a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f48790r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f48791s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ q1 f48792t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0752a(q1 q1Var, kl.f fVar) {
                super(2, fVar);
                this.f48792t = q1Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(qh.h hVar, kl.f fVar) {
                return ((C0752a) create(hVar, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                C0752a c0752a = new C0752a(this.f48792t, fVar);
                c0752a.f48791s = obj;
                return c0752a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f48790r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                this.f48792t.w((qh.h) this.f48791s);
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
            return q1.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f48788r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.z zVarO = q1.this.x().o();
                C0752a c0752a = new C0752a(q1.this, null);
                kotlin.jvm.internal.s.f(zVarO, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f48788r = 1;
                if (hm.g.i(zVarO, c0752a, this) == objF) {
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
        int f48793r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f48795r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ q1 f48796s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q1 q1Var, kl.f fVar) {
                super(2, fVar);
                this.f48796s = q1Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(fl.g0 g0Var, kl.f fVar) {
                return ((a) create(g0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new a(this.f48796s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f48795r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                this.f48796s.B();
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
            return q1.this.new b(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f48793r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.z zVarM = q1.this.x().m();
                a aVar = new a(q1.this, null);
                kotlin.jvm.internal.s.f(zVarM, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f48793r = 1;
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
        int f48797r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f48799r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ int f48800s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ q1 f48801t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q1 q1Var, kl.f fVar) {
                super(2, fVar);
                this.f48801t = q1Var;
            }

            public final Object a(int i10, kl.f fVar) {
                return ((a) create(Integer.valueOf(i10), fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                a aVar = new a(this.f48801t, fVar);
                aVar.f48800s = ((Number) obj).intValue();
                return aVar;
            }

            @Override // tl.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (kl.f) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f48799r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                this.f48801t.A(this.f48800s);
                this.f48801t.B();
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
            return q1.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f48797r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.z zVarN = q1.this.x().n();
                a aVar = new a(q1.this, null);
                kotlin.jvm.internal.s.f(zVarN, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f48797r = 1;
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
    public static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48802a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f48802a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48802a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class e extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48804b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48803a = aVar;
            this.f48804b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48803a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48804b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class f extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48805a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f48805a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48805a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class g extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48806a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f48806a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48806a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class h extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48808b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48807a = aVar;
            this.f48808b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48807a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48808b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class i extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48809a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f48809a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48809a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        getParentFragmentManager().q().n(this).g();
    }

    private final void C(qh.h ratioItem) {
        if (ratioItem.k() == 0 && ratioItem.g() == 0) {
            this.options.f35741l = false;
        } else {
            com.theartofdev.edmodo.cropper.f fVar = this.options;
            fVar.f35741l = true;
            fVar.f35742m = ratioItem.k();
            this.options.f35743n = ratioItem.g();
        }
        tf.s3 s3Var = this.binding;
        if (s3Var == null) {
            kotlin.jvm.internal.s.w("binding");
            s3Var = null;
        }
        s3Var.A.setInitialAttributeValues(this.options);
    }

    private final void D(float width, float height) {
        tf.s3 s3Var = this.binding;
        tf.s3 s3Var2 = null;
        if (s3Var == null) {
            kotlin.jvm.internal.s.w("binding");
            s3Var = null;
        }
        s3Var.A.setVisibility(0);
        tf.s3 s3Var3 = this.binding;
        if (s3Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
            s3Var3 = null;
        }
        s3Var3.A.t(width, height, 1.0f, 1.0f);
        float[] fArr = {0.0f, 0.0f, width, 0.0f, width, height, 0.0f, height};
        tf.s3 s3Var4 = this.binding;
        if (s3Var4 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            s3Var2 = s3Var4;
        }
        s3Var2.A.s(fArr, (int) width, (int) height);
    }

    private final void E() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
        List listA = rh.c.a(contextRequireContext);
        ng.d dVar = this.video;
        if (dVar == null) {
            kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
            dVar = null;
        }
        F((qh.h) listA.get(dVar.g()));
    }

    private final void F(qh.h ratioItem) {
        int color = androidx.core.content.a.getColor(requireContext(), R.color.sunset_orange);
        com.theartofdev.edmodo.cropper.f fVar = this.options;
        fVar.f35751v = color;
        fVar.f35749t = color;
        fVar.f35745p = color;
        fVar.f35733d = CropImageView.d.ON;
        C(ratioItem);
    }

    private final void G(float width, float height) {
        RectF rectF;
        D(width, height);
        int iU = y().g1().u();
        ng.d dVar = this.video;
        if (dVar == null) {
            kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
            dVar = null;
        }
        RectF rectFI = dVar.i();
        if (rectFI == null) {
            H(new RectF(0.0f, 0.0f, width, height));
            return;
        }
        if (iU == -180) {
            float f10 = 1;
            rectF = new RectF((f10 - rectFI.right) * width, (f10 - rectFI.bottom) * height, width * (f10 - rectFI.left), height * (f10 - rectFI.top));
        } else if (iU == -90) {
            float f11 = 1;
            rectF = new RectF((f11 - rectFI.bottom) * width, rectFI.left * height, width * (f11 - rectFI.top), height * rectFI.right);
        } else if (iU != 0) {
            float f12 = 1;
            rectF = new RectF(rectFI.top * width, (f12 - rectFI.right) * height, width * rectFI.bottom, height * (f12 - rectFI.left));
        } else {
            rectF = new RectF(rectFI.left * width, rectFI.top * height, rectFI.right * width, rectFI.bottom * height);
        }
        H(rectF);
    }

    private final void H(RectF rectF) {
        tf.s3 s3Var = this.binding;
        tf.s3 s3Var2 = null;
        if (s3Var == null) {
            kotlin.jvm.internal.s.w("binding");
            s3Var = null;
        }
        s3Var.A.setCropWindowRect(rectF);
        tf.s3 s3Var3 = this.binding;
        if (s3Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            s3Var2 = s3Var3;
        }
        s3Var2.A.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(qh.h ratioItem) {
        float f10;
        tf.s3 s3Var = this.binding;
        tf.s3 s3Var2 = null;
        if (s3Var == null) {
            kotlin.jvm.internal.s.w("binding");
            s3Var = null;
        }
        float width = s3Var.A.getWidth();
        tf.s3 s3Var3 = this.binding;
        if (s3Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            s3Var2 = s3Var3;
        }
        float height = s3Var2.A.getHeight();
        float f11 = 0.0f;
        if (ratioItem.k() == 0 || ratioItem.g() == 0) {
            f10 = 0.0f;
        } else {
            float fK = ratioItem.k() / ratioItem.g();
            float f12 = fK * height;
            if (width >= f12) {
                f10 = 0.0f;
                f11 = (width - f12) / 2;
                width = f12;
            } else {
                float f13 = width / fK;
                f10 = (height - f13) / 2;
                height = f13;
            }
        }
        C(ratioItem);
        H(new RectF(f11, f10, width + f11, height + f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uh.j x() {
        return (uh.j) this.cropViewModel.getValue();
    }

    private final uh.y y() {
        return (uh.y) this.mainViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(q1 q1Var) {
        tf.s3 s3Var = q1Var.binding;
        tf.s3 s3Var2 = null;
        if (s3Var == null) {
            kotlin.jvm.internal.s.w("binding");
            s3Var = null;
        }
        float width = s3Var.A.getWidth();
        tf.s3 s3Var3 = q1Var.binding;
        if (s3Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            s3Var2 = s3Var3;
        }
        q1Var.G(width, s3Var2.A.getHeight());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        this.binding = tf.s3.Y(inflater, container, false);
        this.video = y().g1();
        E();
        tf.s3 s3Var = this.binding;
        if (s3Var == null) {
            kotlin.jvm.internal.s.w("binding");
            s3Var = null;
        }
        View viewB = s3Var.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        androidx.lifecycle.b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.c0.a(viewLifecycleOwner).d(new a(null));
        tf.s3 s3Var = this.binding;
        if (s3Var == null) {
            kotlin.jvm.internal.s.w("binding");
            s3Var = null;
        }
        s3Var.A.post(new Runnable() { // from class: oh.p1
            @Override // java.lang.Runnable
            public final void run() {
                q1.z(this.f48777a);
            }
        });
        androidx.lifecycle.b0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        androidx.lifecycle.c0.a(viewLifecycleOwner2).d(new b(null));
        androidx.lifecycle.b0 viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        androidx.lifecycle.c0.a(viewLifecycleOwner3).d(new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(int cropId) {
        RectF rectF;
        tf.s3 s3Var = this.binding;
        String str = lkCBSIFlvmyGX.uDrKWcoLBObUrA;
        ng.d dVar = null;
        if (s3Var == null) {
            kotlin.jvm.internal.s.w(str);
            s3Var = null;
        }
        RectF cropWindowRect = s3Var.A.getCropWindowRect();
        tf.s3 s3Var2 = this.binding;
        if (s3Var2 == null) {
            kotlin.jvm.internal.s.w(str);
            s3Var2 = null;
        }
        int width = s3Var2.A.getWidth();
        tf.s3 s3Var3 = this.binding;
        if (s3Var3 == null) {
            kotlin.jvm.internal.s.w(str);
            s3Var3 = null;
        }
        int height = s3Var3.A.getHeight();
        int iU = y().g1().u();
        ng.d dVar2 = this.video;
        if (dVar2 == null) {
            kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
            dVar2 = null;
        }
        if (iU == -180) {
            float f10 = 1;
            float f11 = width;
            float f12 = height;
            rectF = new RectF(f10 - (cropWindowRect.right / f11), f10 - (cropWindowRect.bottom / f12), f10 - (cropWindowRect.left / f11), f10 - (cropWindowRect.top / f12));
        } else if (iU == -90) {
            float f13 = height;
            float f14 = 1;
            float f15 = width;
            rectF = new RectF(cropWindowRect.top / f13, f14 - (cropWindowRect.right / f15), cropWindowRect.bottom / f13, f14 - (cropWindowRect.left / f15));
        } else if (iU != 0) {
            float f16 = 1;
            float f17 = height;
            float f18 = width;
            rectF = new RectF(f16 - (cropWindowRect.bottom / f17), cropWindowRect.left / f18, f16 - (cropWindowRect.top / f17), cropWindowRect.right / f18);
        } else {
            float f19 = width;
            float f20 = height;
            rectF = new RectF(cropWindowRect.left / f19, cropWindowRect.top / f20, cropWindowRect.right / f19, cropWindowRect.bottom / f20);
        }
        dVar2.D(rectF);
        ng.d dVar3 = this.video;
        if (dVar3 == null) {
            kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
            dVar3 = null;
        }
        dVar3.C(cropId);
        ng.d dVar4 = this.video;
        if (dVar4 == null) {
            kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
            dVar4 = null;
        }
        if (dVar4.f() == null) {
            String str2 = (String) y().G0().f();
            if (str2 != null) {
                ng.d dVar5 = this.video;
                if (dVar5 == null) {
                    kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
                    dVar5 = null;
                }
                dVar5.B(new qh.b(str2, 0.0f, 0.0f, 1.0f));
            }
        } else {
            ng.d dVar6 = this.video;
            if (dVar6 == null) {
                kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
                dVar6 = null;
            }
            qh.b bVarF = dVar6.f();
            if (bVarF != null) {
                bVarF.g(0.0f);
            }
            ng.d dVar7 = this.video;
            if (dVar7 == null) {
                kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
                dVar7 = null;
            }
            qh.b bVarF2 = dVar7.f();
            if (bVarF2 != null) {
                bVarF2.i(0.0f);
            }
            ng.d dVar8 = this.video;
            if (dVar8 == null) {
                kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
                dVar8 = null;
            }
            qh.b bVarF3 = dVar8.f();
            if (bVarF3 != null) {
                bVarF3.j(1.0f);
            }
        }
        y().h2();
        ng.d dVar9 = this.video;
        if (dVar9 == null) {
            kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
        } else {
            dVar = dVar9;
        }
        wp.a.a("Crop percent: %s", dVar.i());
    }
}
