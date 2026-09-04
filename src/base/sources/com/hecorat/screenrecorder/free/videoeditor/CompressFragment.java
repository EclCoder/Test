package com.hecorat.screenrecorder.free.videoeditor;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s1;
import androidx.lifecycle.x0;
import com.google.android.exoplayer2.x1;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.CompressFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.xw.repo.BubbleSeekBar;
import em.o0;
import fl.g0;
import fl.q;
import fl.s;
import gl.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import lf.n;
import n0.u;
import nh.l0;
import tf.o3;
import tl.o;
import wf.h0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/CompressFragment;", "Landroidx/fragment/app/Fragment;", "Llf/n$c;", "<init>", "()V", "Lfl/g0;", "v", "z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "h", "f", "Ltf/o3;", "a", "Ltf/o3;", "binding", "Luh/h;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Luh/h;", "viewModel", "Lng/d;", "c", "Lng/d;", MimeTypes.BASE_TYPE_VIDEO, "Llf/n;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Llf/n;", "rewardedAdsManager", "Llg/a;", "e", "Llg/a;", "w", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompressFragment extends Fragment implements n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public o3 binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public uh.h viewModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ng.d video;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public n rewardedAdsManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23234r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.hecorat.screenrecorder.free.videoeditor.e f23236t;

        /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.CompressFragment$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0337a extends kotlin.coroutines.jvm.internal.m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23237r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ CompressFragment f23238s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ com.hecorat.screenrecorder.free.videoeditor.e f23239t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0337a(CompressFragment compressFragment, com.hecorat.screenrecorder.free.videoeditor.e eVar, kl.f fVar) {
                super(2, fVar);
                this.f23238s = compressFragment;
                this.f23239t = eVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, kl.f fVar) {
                return ((C0337a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new C0337a(this.f23238s, this.f23239t, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23237r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                if (this.f23238s.getChildFragmentManager().k0("ExportFragment") == null) {
                    this.f23239t.show(this.f23238s.getChildFragmentManager(), "ExportFragment");
                }
                return g0.f38750a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.hecorat.screenrecorder.free.videoeditor.e eVar, kl.f fVar) {
            super(2, fVar);
            this.f23236t = eVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return CompressFragment.this.new a(this.f23236t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23234r;
            if (i10 == 0) {
                s.b(obj);
                androidx.lifecycle.s lifecycle = CompressFragment.this.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.s.b bVar = androidx.lifecycle.s.b.STARTED;
                C0337a c0337a = new C0337a(CompressFragment.this, this.f23236t, null);
                this.f23234r = 1;
                if (x0.a(lifecycle, bVar, c0337a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements BubbleSeekBar.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f23241b;

        public b(List list) {
            this.f23241b = list;
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void a(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void b(BubbleSeekBar bubbleSeekBar, int i10, float f10) {
            uh.h hVar = CompressFragment.this.viewModel;
            if (hVar == null) {
                kotlin.jvm.internal.s.w("viewModel");
                hVar = null;
            }
            hVar.v().q(Float.valueOf(((Number) this.f23241b.get(i10)).intValue()));
            wp.a.a("progress of resolution: %s", this.f23241b.get(i10));
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void c(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements BubbleSeekBar.k {
        public c() {
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void a(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void b(BubbleSeekBar bubbleSeekBar, int i10, float f10) {
            uh.h hVar = CompressFragment.this.viewModel;
            if (hVar == null) {
                kotlin.jvm.internal.s.w("viewModel");
                hVar = null;
            }
            hVar.u().q(sh.b.m().get(i10));
            wp.a.a("progress of quality: %s", sh.b.m().get(i10));
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void c(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d implements kotlin.jvm.internal.m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f23243a;

        public d(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f23243a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f23243a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23243a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements u {
        public e() {
        }

        @Override // n0.u
        public boolean c(MenuItem menuItem) {
            kotlin.jvm.internal.s.h(menuItem, "menuItem");
            int itemId = menuItem.getItemId();
            if (itemId == 16908332) {
                CompressFragment.this.requireActivity().finish();
                return true;
            }
            if (itemId != R.id.compress) {
                return false;
            }
            if (l0.o()) {
                CompressFragment.this.v();
            } else {
                h0 h0Var = new h0("compress_video");
                androidx.fragment.app.s activity = CompressFragment.this.getActivity();
                if (activity != null) {
                    h0Var.show(activity.getSupportFragmentManager(), "upgrade or watch ad dialog");
                }
            }
            return false;
        }

        @Override // n0.u
        public void d(Menu menu, MenuInflater menuInflater) {
            kotlin.jvm.internal.s.h(menu, "menu");
            kotlin.jvm.internal.s.h(menuInflater, "menuInflater");
            menuInflater.inflate(R.menu.menu_compress, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        lg.a aVarW = w();
        ng.d dVar = this.video;
        if (dVar == null) {
            kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
            dVar = null;
        }
        if (!sh.b.z(context, aVarW, dVar.w())) {
            sh.b.D(context);
            return;
        }
        uh.h hVar = this.viewModel;
        if (hVar == null) {
            kotlin.jvm.internal.s.w("viewModel");
            hVar = null;
        }
        q qVarP = hVar.p(w());
        ArrayList arrayList = new ArrayList();
        ng.d dVar2 = this.video;
        if (dVar2 == null) {
            kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
            dVar2 = null;
        }
        String strT = dVar2.t();
        ng.d dVar3 = this.video;
        if (dVar3 == null) {
            kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
            dVar3 = null;
        }
        arrayList.add(new qh.e(strT, dVar3.b()));
        com.hecorat.screenrecorder.free.videoeditor.e.Companion companion = com.hecorat.screenrecorder.free.videoeditor.e.INSTANCE;
        String str = (String) qVarP.h();
        String str2 = (String) qVarP.i();
        ng.d dVar4 = this.video;
        if (dVar4 == null) {
            kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
            dVar4 = null;
        }
        com.hecorat.screenrecorder.free.videoeditor.e eVarA = companion.a(str, str2, dVar4.j(), "video/*", arrayList);
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        em.k.d(c0.a(viewLifecycleOwner), null, null, new a(eVarA, null), 3, null);
    }

    public static final g0 x(CompressFragment compressFragment, x1 x1Var) {
        o3 o3Var = compressFragment.binding;
        o3 o3Var2 = null;
        if (o3Var == null) {
            kotlin.jvm.internal.s.w("binding");
            o3Var = null;
        }
        o3Var.D.setPlayer(x1Var);
        o3 o3Var3 = compressFragment.binding;
        if (o3Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            o3Var2 = o3Var3;
        }
        o3Var2.C.setPlayer(x1Var);
        return g0.f38750a;
    }

    public static final SparseArray y(CompressFragment compressFragment, int i10, SparseArray array) {
        kotlin.jvm.internal.s.h(array, "array");
        array.clear();
        array.put(0, compressFragment.getString(R.string.low));
        array.put(1, compressFragment.getString(R.string.medium));
        array.put(2, compressFragment.getString(R.string.high));
        return array;
    }

    private final void z() {
        androidx.fragment.app.s sVarRequireActivity = requireActivity();
        kotlin.jvm.internal.s.g(sVarRequireActivity, "requireActivity(...)");
        sVarRequireActivity.addMenuProvider(new e(), getViewLifecycleOwner(), androidx.lifecycle.s.b.RESUMED);
    }

    @Override // lf.n.c
    public void f() {
    }

    @Override // lf.n.c
    public void h() {
        v();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        AzRecorderApp.d().K(this);
        o3 o3VarY = o3.Y(inflater, container, false);
        this.binding = o3VarY;
        if (o3VarY == null) {
            kotlin.jvm.internal.s.w("binding");
            o3VarY = null;
        }
        View viewB = o3VarY.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        n nVar = this.rewardedAdsManager;
        if (nVar != null) {
            nVar.l();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws IOException {
        List listO;
        int iR;
        Intent intent;
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        androidx.fragment.app.s activity = getActivity();
        o3 o3Var = null;
        Uri data = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getData();
        if (data == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
        ng.d dVarW = sh.b.w(contextRequireContext, data);
        if (dVarW != null) {
            this.video = dVarW;
            androidx.fragment.app.s sVarRequireActivity = requireActivity();
            kotlin.jvm.internal.s.f(sVarRequireActivity, "null cannot be cast to non-null type com.hecorat.screenrecorder.free.videoeditor.CompressActivity");
            CompressActivity compressActivity = (CompressActivity) sVarRequireActivity;
            o3 o3Var2 = this.binding;
            if (o3Var2 == null) {
                kotlin.jvm.internal.s.w("binding");
                o3Var2 = null;
            }
            Toolbar toolbar = o3Var2.I;
            kotlin.jvm.internal.s.g(toolbar, "toolbar");
            compressActivity.y0(toolbar);
            z();
            if (!l0.o()) {
                n nVarA = n.f44484g.a(n.a.COMPRESS);
                this.rewardedAdsManager = nVarA;
                if (nVarA != null) {
                    nVarA.o(this);
                }
                n nVar = this.rewardedAdsManager;
                if (nVar != null) {
                    nVar.m();
                }
                lf.i.f44428h.a(lf.l.f44461f.a(lf.l.a.EXPORT), lf.c.f44397g.a(lf.c.a.EXPORT));
            }
            Application application = requireActivity().getApplication();
            kotlin.jvm.internal.s.g(application, "getApplication(...)");
            ng.d dVar = this.video;
            if (dVar == null) {
                kotlin.jvm.internal.s.w(MimeTypes.BASE_TYPE_VIDEO);
                dVar = null;
            }
            this.viewModel = (uh.h) new s1(this, new uh.i(application, dVar)).a(uh.h.class);
            o3 o3Var3 = this.binding;
            if (o3Var3 == null) {
                kotlin.jvm.internal.s.w("binding");
                o3Var3 = null;
            }
            o3Var3.S(this);
            o3 o3Var4 = this.binding;
            if (o3Var4 == null) {
                kotlin.jvm.internal.s.w("binding");
                o3Var4 = null;
            }
            uh.h hVar = this.viewModel;
            if (hVar == null) {
                kotlin.jvm.internal.s.w("viewModel");
                hVar = null;
            }
            o3Var4.a0(hVar);
            uh.h hVar2 = this.viewModel;
            if (hVar2 == null) {
                kotlin.jvm.internal.s.w("viewModel");
                hVar2 = null;
            }
            hVar2.t().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CompressFragment.x(this.f48714a, (com.google.android.exoplayer2.x1) obj);
                }
            }));
            List listU = sh.b.u();
            uh.h hVar3 = this.viewModel;
            if (hVar3 == null) {
                kotlin.jvm.internal.s.w("viewModel");
                hVar3 = null;
            }
            int iIndexOf = listU.indexOf(Integer.valueOf(hVar3.r()));
            if (iIndexOf > 0) {
                listO = sh.b.u().subList(0, iIndexOf + 1);
            } else {
                uh.h hVar4 = this.viewModel;
                if (hVar4 == null) {
                    kotlin.jvm.internal.s.w("viewModel");
                    hVar4 = null;
                }
                Integer numValueOf = Integer.valueOf(hVar4.r());
                uh.h hVar5 = this.viewModel;
                if (hVar5 == null) {
                    kotlin.jvm.internal.s.w("viewModel");
                    hVar5 = null;
                }
                listO = r.o(numValueOf, Integer.valueOf(hVar5.r()));
            }
            if (iIndexOf > 0) {
                iR = ((Number) listO.get(iIndexOf - 1)).intValue();
            } else {
                uh.h hVar6 = this.viewModel;
                if (hVar6 == null) {
                    kotlin.jvm.internal.s.w("viewModel");
                    hVar6 = null;
                }
                iR = hVar6.r();
            }
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.s.g(contextRequireContext2, "requireContext(...)");
            o3 o3Var5 = this.binding;
            if (o3Var5 == null) {
                kotlin.jvm.internal.s.w("binding");
                o3Var5 = null;
            }
            BubbleSeekBar resolutionBsb = o3Var5.G;
            kotlin.jvm.internal.s.g(resolutionBsb, "resolutionBsb");
            sh.b.f(contextRequireContext2, resolutionBsb, iR, listO);
            o3 o3Var6 = this.binding;
            if (o3Var6 == null) {
                kotlin.jvm.internal.s.w("binding");
                o3Var6 = null;
            }
            o3Var6.G.setOnProgressChangedListener(new b(listO));
            int size = sh.b.m().size() - 1;
            Context contextRequireContext3 = requireContext();
            kotlin.jvm.internal.s.g(contextRequireContext3, "requireContext(...)");
            o3 o3Var7 = this.binding;
            if (o3Var7 == null) {
                kotlin.jvm.internal.s.w("binding");
                o3Var7 = null;
            }
            BubbleSeekBar qualityBsb = o3Var7.E;
            kotlin.jvm.internal.s.g(qualityBsb, "qualityBsb");
            float f10 = size;
            sh.b.h(contextRequireContext3, qualityBsb, f10, f10, size);
            o3 o3Var8 = this.binding;
            if (o3Var8 == null) {
                kotlin.jvm.internal.s.w("binding");
                o3Var8 = null;
            }
            o3Var8.E.setCustomSectionTextArray(new BubbleSeekBar.j() { // from class: oh.m1
                @Override // com.xw.repo.BubbleSeekBar.j
                public final SparseArray a(int i10, SparseArray sparseArray) {
                    return CompressFragment.y(this.f48731a, i10, sparseArray);
                }
            });
            o3 o3Var9 = this.binding;
            if (o3Var9 == null) {
                kotlin.jvm.internal.s.w("binding");
            } else {
                o3Var = o3Var9;
            }
            o3Var.E.setOnProgressChangedListener(new c());
        }
    }

    public final lg.a w() {
        lg.a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.s.w("preferenceManager");
        return null;
    }
}
