package com.hecorat.screenrecorder.free.videoeditor;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.d0;
import androidx.activity.i0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.b0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.videoeditor.CropFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import fl.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import tf.q3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/CropFragment;", "Lcom/hecorat/screenrecorder/free/videoeditor/d;", "Ltf/q3;", "<init>", "()V", "Lqh/h;", "ratioItem", "Lfl/g0;", "J", "(Lqh/h;)V", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", "I", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/q3;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "y", "C", "Luh/j;", "c", "Lfl/k;", "H", "()Luh/j;", "cropViewModel", "Lph/h;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lph/h;", "adapter", "Lng/d;", "e", "Lng/d;", MimeTypes.BASE_TYPE_VIDEO, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CropFragment extends com.hecorat.screenrecorder.free.videoeditor.d<q3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.k cropViewModel = t0.b(this, l0.b(uh.j.class), new b(this), new c(null, this), new d(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ph.h adapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ng.d video;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends d0 {
        public a() {
            super(true);
        }

        @Override // androidx.activity.d0
        public void d() {
            CropFragment.this.H().p();
            androidx.navigation.fragment.a.a(CropFragment.this).L();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f23249a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            t1 viewModelStore = this.f23249a.requireActivity().getViewModelStore();
            s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f23251b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, Fragment fragment) {
            super(0);
            this.f23250a = aVar;
            this.f23251b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23250a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f23251b.requireActivity().getDefaultViewModelCreationExtras();
            s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23252a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f23252a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory = this.f23252a.requireActivity().getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uh.j H() {
        return (uh.j) this.cropViewModel.getValue();
    }

    private final void J(qh.h ratioItem) {
        ph.h hVar = this.adapter;
        if (hVar == null) {
            s.w("adapter");
            hVar = null;
        }
        hVar.j(ratioItem);
        H().r(ratioItem);
    }

    public static final g0 K(CropFragment cropFragment, qh.h ratioItem) {
        s.h(ratioItem, "ratioItem");
        cropFragment.J(ratioItem);
        return g0.f38750a;
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    public void C() {
        super.C();
        uh.j jVarH = H();
        ph.h hVar = this.adapter;
        if (hVar == null) {
            s.w("adapter");
            hVar = null;
        }
        jVarH.q(hVar.k());
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public q3 x(LayoutInflater layoutInflater, ViewGroup container) {
        s.h(layoutInflater, "layoutInflater");
        q3 q3VarY = q3.Y(layoutInflater, container, false);
        s.g(q3VarY, "inflate(...)");
        return q3VarY;
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((q3) w()).a0(v());
        this.adapter = new ph.h(new Function1() { // from class: oh.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CropFragment.K(this.f48769a, (qh.h) obj);
            }
        });
        RecyclerView recyclerView = ((q3) w()).E;
        ph.h hVar = this.adapter;
        ng.d dVar = null;
        if (hVar == null) {
            s.w("adapter");
            hVar = null;
        }
        recyclerView.setAdapter(hVar);
        ph.h hVar2 = this.adapter;
        if (hVar2 == null) {
            s.w("adapter");
            hVar2 = null;
        }
        Context contextRequireContext = requireContext();
        s.g(contextRequireContext, "requireContext(...)");
        hVar2.i(rh.c.a(contextRequireContext));
        this.video = v().g1();
        ph.h hVar3 = this.adapter;
        if (hVar3 == null) {
            s.w("adapter");
            hVar3 = null;
        }
        ng.d dVar2 = this.video;
        if (dVar2 == null) {
            s.w(MimeTypes.BASE_TYPE_VIDEO);
        } else {
            dVar = dVar2;
        }
        hVar3.o(dVar.g());
        i0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.g(viewLifecycleOwner, new a());
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    public void y() {
        H().p();
        super.y();
    }
}
