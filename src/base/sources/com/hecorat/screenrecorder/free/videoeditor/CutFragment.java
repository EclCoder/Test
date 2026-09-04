package com.hecorat.screenrecorder.free.videoeditor;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.d0;
import androidx.activity.i0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.b0;
import androidx.lifecycle.q;
import androidx.lifecycle.q0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import c1.pGX.geAgcEazw;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.CutFragment;
import com.hecorat.screenrecorder.free.videoeditor.view.VideoRangeSeekBar;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fl.g0;
import fl.o;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import mf.n;
import n0.e0;
import nh.j0;
import ta.QXA.YSHErhbVu;
import tf.u3;
import uh.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0005R\u0016\u0010!\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/CutFragment;", "Lcom/hecorat/screenrecorder/free/videoeditor/d;", "Ltf/u3;", "Lcom/hecorat/screenrecorder/free/videoeditor/view/VideoRangeSeekBar$b;", "<init>", "()V", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", "L", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/u3;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "startTime", "endTime", "a", "(JJ)V", "pos", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(J)V", "M", "(Landroid/view/View;)V", "C", "y", "c", "J", "duration", "Luh/n;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lfl/k;", "K", "()Luh/n;", "cutViewModel", "Lng/d;", "e", "Lng/d;", "videoItem", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CutFragment extends com.hecorat.screenrecorder.free.videoeditor.d<u3> implements VideoRangeSeekBar.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long duration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final fl.k cutViewModel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ng.d videoItem;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f23256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CutFragment f23257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f23258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f23259d;

        public a(View view, CutFragment cutFragment, long j10, long j11) {
            this.f23256a = view;
            this.f23257b = cutFragment;
            this.f23258c = j10;
            this.f23259d = j11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int dimensionPixelSize = this.f23257b.getResources().getDimensionPixelSize(R.dimen.trim_seek_bar_horizontal_margin);
            int dimensionPixelSize2 = this.f23257b.getResources().getDimensionPixelSize(R.dimen.trim_seek_bar_vertical_margin);
            int width = ((u3) this.f23257b.w()).H.getWidth() - dimensionPixelSize;
            int height = ((u3) this.f23257b.w()).H.getHeight() - dimensionPixelSize2;
            ((u3) this.f23257b.w()).H.u(this.f23257b.duration, dimensionPixelSize, width, dimensionPixelSize2, height, this.f23257b);
            ((u3) this.f23257b.w()).H.t(this.f23258c, this.f23259d);
            ((u3) this.f23257b.w()).H.w(this.f23257b.v().E0());
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Handler handler = new Handler(Looper.getMainLooper());
            executorServiceNewSingleThreadExecutor.execute(new c(height, dimensionPixelSize2, this.f23257b, width - dimensionPixelSize, handler));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends d0 {
        public b() {
            super(true);
        }

        @Override // androidx.activity.d0
        public void d() {
            y yVarV = CutFragment.this.v();
            ng.d dVar = CutFragment.this.videoItem;
            if (dVar == null) {
                s.w(YSHErhbVu.dejV);
                dVar = null;
            }
            yVarV.d0(dVar);
            androidx.navigation.fragment.a.a(CutFragment.this).L();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f23261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f23262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CutFragment f23263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f23264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Handler f23265e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Handler f23266a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CutFragment f23267b;

            /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.CutFragment$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            static final class RunnableC0338a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ CutFragment f23268a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ArrayList f23269b;

                public RunnableC0338a(CutFragment cutFragment, ArrayList arrayList) {
                    this.f23268a = cutFragment;
                    this.f23269b = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ((u3) this.f23268a.w()).H.y(this.f23269b);
                }
            }

            public a(Handler handler, CutFragment cutFragment) {
                this.f23266a = handler;
                this.f23267b = cutFragment;
            }

            public final void a(ArrayList thumbList) {
                s.h(thumbList, "thumbList");
                this.f23266a.post(new RunnableC0338a(this.f23267b, thumbList));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ArrayList) obj);
                return g0.f38750a;
            }
        }

        public c(int i10, int i11, CutFragment cutFragment, int i12, Handler handler) {
            this.f23261a = i10;
            this.f23262b = i11;
            this.f23263c = cutFragment;
            this.f23264d = i12;
            this.f23265e = handler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f23261a - this.f23262b;
            n nVar = new n();
            Context contextRequireContext = this.f23263c.requireContext();
            s.g(contextRequireContext, "requireContext(...)");
            ng.d dVar = this.f23263c.videoItem;
            if (dVar == null) {
                s.w("videoItem");
                dVar = null;
            }
            nVar.a(contextRequireContext, dVar, this.f23264d, i10, new a(this.f23265e, this.f23263c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d implements kotlin.jvm.internal.m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f23270a;

        public d(Function1 function) {
            s.h(function, "function");
            this.f23270a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f23270a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23270a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23271a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f23271a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f23271a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23272a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.a aVar) {
            super(0);
            this.f23272a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return (u1) this.f23272a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fl.k f23273a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(fl.k kVar) {
            super(0);
            this.f23273a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            return t0.c(this.f23273a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fl.k f23275b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.a aVar, fl.k kVar) {
            super(0);
            this.f23274a = aVar;
            this.f23275b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23274a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            u1 u1VarC = t0.c(this.f23275b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fl.k f23277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment, fl.k kVar) {
            super(0);
            this.f23276a = fragment;
            this.f23277b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory;
            u1 u1VarC = t0.c(this.f23277b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            if (qVar != null && (defaultViewModelProviderFactory = qVar.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            s1.c defaultViewModelProviderFactory2 = this.f23276a.getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    public CutFragment() {
        fl.k kVarA = fl.l.a(o.NONE, new f(new e(this)));
        this.cutViewModel = t0.b(this, l0.b(uh.n.class), new g(kVarA), new h(null, kVarA), new i(this, kVarA));
    }

    private final uh.n K() {
        return (uh.n) this.cutViewModel.getValue();
    }

    public static final void N(CutFragment cutFragment, View view) {
        Object objF = cutFragment.K().t().f();
        Object objF2 = cutFragment.K().r().f();
        Long lP = cutFragment.K().p();
        if (objF != null && objF2 != null && lP != null) {
            long jLongValue = lP.longValue();
            long jLongValue2 = ((Number) objF2).longValue();
            long jLongValue3 = ((Number) objF).longValue();
            if (cutFragment.K().v().j() && jLongValue > jLongValue2 - ((long) 100)) {
                cutFragment.v().S1(jLongValue3, false);
            }
        }
        cutFragment.v().f2();
    }

    public static final void O(CutFragment cutFragment, View view) {
        cutFragment.v().C1();
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    public void C() {
        boolean zJ = K().v().j();
        ng.d dVar = this.videoItem;
        ng.d dVar2 = null;
        if (dVar == null) {
            s.w("videoItem");
            dVar = null;
        }
        long jX = dVar.x();
        Object objF = K().t().f();
        s.e(objF);
        long jLongValue = jX + ((Number) objF).longValue();
        ng.d dVar3 = this.videoItem;
        if (dVar3 == null) {
            s.w("videoItem");
            dVar3 = null;
        }
        long jX2 = dVar3.x();
        Object objF2 = K().r().f();
        s.e(objF2);
        long jLongValue2 = jX2 + ((Number) objF2).longValue();
        if (zJ) {
            if (jLongValue2 - jLongValue < 1000) {
                j0.b(requireContext(), R.string.cut_duration_warning);
                return;
            } else {
                v().R1(jLongValue, jLongValue2);
                androidx.navigation.fragment.a.a(this).L();
                return;
            }
        }
        if (jLongValue == jLongValue2) {
            androidx.navigation.fragment.a.a(this).L();
            return;
        }
        ng.d dVar4 = this.videoItem;
        if (dVar4 == null) {
            s.w("videoItem");
            dVar4 = null;
        }
        if (jLongValue - dVar4.x() >= 1000) {
            ng.d dVar5 = this.videoItem;
            if (dVar5 == null) {
                s.w("videoItem");
                dVar5 = null;
            }
            if (dVar5.n() - jLongValue2 >= 1000) {
                y yVarV = v();
                ng.d dVar6 = this.videoItem;
                if (dVar6 == null) {
                    s.w("videoItem");
                    dVar6 = null;
                }
                long jX3 = dVar6.x();
                ng.d dVar7 = this.videoItem;
                if (dVar7 == null) {
                    s.w("videoItem");
                } else {
                    dVar2 = dVar7;
                }
                yVarV.Q1(jX3, jLongValue, jLongValue2, dVar2.n());
                androidx.navigation.fragment.a.a(this).L();
                return;
            }
        }
        j0.b(requireContext(), R.string.cut_duration_warning);
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public u3 x(LayoutInflater layoutInflater, ViewGroup container) {
        s.h(layoutInflater, "layoutInflater");
        v().B1();
        u3 u3VarY = u3.Y(layoutInflater, container, false);
        s.g(u3VarY, "inflate(...)");
        return u3VarY;
    }

    public final void M(View view) {
        long jLongValue;
        s.h(view, "view");
        boolean z10 = view.getId() == R.id.trim_btn;
        K().v().l(z10);
        ((u3) w()).H.setMode(z10);
        if (z10) {
            Object objF = K().t().f();
            s.e(objF);
            jLongValue = ((Number) objF).longValue();
        } else {
            if (((u3) w()).H.getLeftBoundTime() == 0 || ((u3) w()).H.getRightBoundTime() == this.duration) {
                long j10 = this.duration;
                if (j10 > 1000) {
                    long j11 = 4;
                    long j12 = j10 / j11;
                    long j13 = (((long) 3) * j10) / j11;
                    ((u3) w()).H.t(j12, j13);
                    K().x(j12, j13);
                }
            }
            jLongValue = 0;
        }
        K().w(Long.valueOf(jLongValue));
        v().S1(jLongValue, false);
        ((u3) w()).H.w(jLongValue);
        wp.a.a("Clicked: %s", Boolean.valueOf(z10));
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.view.VideoRangeSeekBar.b
    public void a(long startTime, long endTime) {
        K().x(startTime, endTime);
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.view.VideoRangeSeekBar.b
    public void b(long pos) {
        wp.a.a("onSeekbarPositionUpdated: " + pos, new Object[0]);
        v().S1(pos, false);
        K().w(Long.valueOf(pos));
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((u3) w()).c0(K());
        ((u3) w()).a0(v());
        ((u3) w()).b0(this);
        i0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.g(viewLifecycleOwner, new b());
        ng.d dVarG1 = v().g1();
        this.videoItem = dVarG1;
        ng.d dVar = null;
        if (dVarG1 == null) {
            s.w("videoItem");
            dVarG1 = null;
        }
        long jN = dVarG1.n();
        ng.d dVar2 = this.videoItem;
        if (dVar2 == null) {
            s.w("videoItem");
            dVar2 = null;
        }
        this.duration = jN - dVar2.x();
        ng.d dVar3 = this.videoItem;
        if (dVar3 == null) {
            s.w("videoItem");
            dVar3 = null;
        }
        long jZ = dVar3.z();
        ng.d dVar4 = this.videoItem;
        if (dVar4 == null) {
            s.w("videoItem");
            dVar4 = null;
        }
        long jX = jZ - dVar4.x();
        ng.d dVar5 = this.videoItem;
        if (dVar5 == null) {
            s.w("videoItem");
            dVar5 = null;
        }
        long jY = dVar5.y();
        ng.d dVar6 = this.videoItem;
        if (dVar6 == null) {
            s.w("videoItem");
        } else {
            dVar = dVar6;
        }
        long jX2 = jY - dVar.x();
        K().x(jX, jX2);
        VideoRangeSeekBar rangeSeekBar = ((u3) w()).H;
        s.g(rangeSeekBar, "rangeSeekBar");
        e0.a(rangeSeekBar, new a(rangeSeekBar, this, jX, jX2));
        ((u3) w()).F.setOnClickListener(new View.OnClickListener() { // from class: oh.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CutFragment.N(this.f48829a, view2);
            }
        });
        ((u3) w()).E.setOnClickListener(new View.OnClickListener() { // from class: oh.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CutFragment.O(this.f48842a, view2);
            }
        });
        v().X0().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.t1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CutFragment.P(this.f48855a, (Long) obj);
            }
        }));
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    public void y() {
        y yVarV = v();
        ng.d dVar = this.videoItem;
        if (dVar == null) {
            s.w("videoItem");
            dVar = null;
        }
        yVarV.d0(dVar);
        super.y();
    }

    public static final g0 P(CutFragment cutFragment, Long l10) {
        if (cutFragment.v().W0().f() == null) {
            return g0.f38750a;
        }
        Object objF = cutFragment.v().p1().f();
        s.e(objF);
        if (!((Boolean) objF).booleanValue()) {
            return g0.f38750a;
        }
        long jE0 = cutFragment.v().E0();
        Object objF2 = cutFragment.K().t().f();
        Object objF3 = cutFragment.K().r().f();
        if (objF2 != null && objF3 != null) {
            long jLongValue = ((Number) objF3).longValue();
            long jLongValue2 = ((Number) objF2).longValue();
            wp.a.a("CutFragment: position: " + jE0 + ", endTime: " + jLongValue + geAgcEazw.jQxkpXPe + jLongValue2, new Object[0]);
            if (cutFragment.K().v().j()) {
                if (jE0 > jLongValue) {
                    cutFragment.v().C1();
                }
            } else if (jLongValue2 <= jE0 && jE0 < jLongValue - ((long) 100)) {
                cutFragment.v().S1(jLongValue, true);
            }
            cutFragment.K().w(Long.valueOf(jE0));
            ((u3) cutFragment.w()).H.w(jE0);
        }
        return g0.f38750a;
    }
}
