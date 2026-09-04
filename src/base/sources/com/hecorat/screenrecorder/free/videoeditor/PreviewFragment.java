package com.hecorat.screenrecorder.free.videoeditor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.d0;
import androidx.activity.i0;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.k0;
import androidx.lifecycle.b0;
import androidx.lifecycle.q0;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.PreviewFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import fl.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import n0.u;
import ph.o;
import tf.s4;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u001d\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0005¢\u0006\u0004\b#\u0010\u0004J\r\u0010$\u001a\u00020\u0005¢\u0006\u0004\b$\u0010\u0004J\r\u0010%\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u0004J\r\u0010&\u001a\u00020\u0005¢\u0006\u0004\b&\u0010\u0004J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u0004J\r\u0010(\u001a\u00020\u0005¢\u0006\u0004\b(\u0010\u0004J\r\u0010)\u001a\u00020\u0005¢\u0006\u0004\b)\u0010\u0004J\r\u0010*\u001a\u00020\u0005¢\u0006\u0004\b*\u0010\u0004J\r\u0010+\u001a\u00020\u0005¢\u0006\u0004\b+\u0010\u0004J\r\u0010,\u001a\u00020\u0005¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010\u0004R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/PreviewFragment;", "Lcom/hecorat/screenrecorder/free/videoeditor/d;", "Ltf/s4;", "<init>", "()V", "Lfl/g0;", "R", "V", "Lng/d;", MimeTypes.BASE_TYPE_VIDEO, "q0", "(Lng/d;)V", "s0", "u0", "t0", "", "videoList", "Y", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", "U", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/s4;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "source", "k0", "(Ljava/lang/String;)V", "p0", "g0", "i0", "h0", "m0", "f0", "n0", "o0", "Q", "r0", "onResume", "onStop", "Lph/l;", "c", "Lph/l;", "videosAdapter", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewFragment extends d<s4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ph.l videosAdapter;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends d0 {
        public a() {
            super(true);
        }

        @Override // androidx.activity.d0
        public void d() {
            PreviewFragment.this.R();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements kotlin.jvm.internal.m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f23355a;

        public b(Function1 function) {
            s.h(function, "function");
            this.f23355a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f23355a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23355a.invoke(obj);
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
    public static final class c implements u {
        public c() {
        }

        @Override // n0.u
        public void b(Menu menu) {
            s.h(menu, "menu");
            MenuItem menuItemFindItem = menu.findItem(R.id.remove_all_captions);
            if (menuItemFindItem != null) {
                menuItemFindItem.setVisible(PreviewFragment.this.v().m1());
            }
        }

        @Override // n0.u
        public boolean c(MenuItem menuItem) {
            s.h(menuItem, "menuItem");
            if (menuItem.getItemId() != R.id.remove_all_captions) {
                return false;
            }
            PreviewFragment.this.v().I1();
            nf.l lVar = nf.l.f47604a;
            Context contextRequireContext = PreviewFragment.this.requireContext();
            s.g(contextRequireContext, "requireContext(...)");
            lVar.B(contextRequireContext);
            PreviewFragment.this.requireActivity().invalidateOptionsMenu();
            return true;
        }

        @Override // n0.u
        public void d(Menu menu, MenuInflater menuInflater) {
            s.h(menu, "menu");
            s.h(menuInflater, "menuInflater");
            menuInflater.inflate(R.menu.menu_preview, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        if (v().I0()) {
            new AlertDialog.Builder(getContext()).setTitle(R.string.confirm_exit).setMessage(getString(R.string.warning_to_save)).setPositiveButton(R.string.export_video, new DialogInterface.OnClickListener() { // from class: oh.k3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    PreviewFragment.S(this.f48710a, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.exit, new DialogInterface.OnClickListener() { // from class: oh.l3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    PreviewFragment.T(this.f48727a, dialogInterface, i10);
                }
            }).show();
            return;
        }
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void S(PreviewFragment previewFragment, DialogInterface dialogInterface, int i10) {
        previewFragment.v().v1();
    }

    public static final void T(PreviewFragment previewFragment, DialogInterface dialogInterface, int i10) {
        androidx.fragment.app.s activity = previewFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void V() {
        m.INSTANCE.a(false).show(getChildFragmentManager(), "VideoPicker_multi");
    }

    public static final void W(View view, final PreviewFragment previewFragment) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: oh.j3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PreviewFragment.X(this.f48705a, view2);
                }
            });
        }
    }

    public static final void X(PreviewFragment previewFragment, View view) {
        previewFragment.R();
    }

    private final void Y(List videoList) {
        int size = v().k1().size();
        v().b0(videoList);
        ph.l lVar = this.videosAdapter;
        if (lVar == null) {
            s.w("videosAdapter");
            lVar = null;
        }
        lVar.notifyItemRangeInserted(size, videoList.size());
        u0();
    }

    public static final g0 Z(PreviewFragment previewFragment, ng.d video) {
        s.h(video, "video");
        previewFragment.q0(video);
        return g0.f38750a;
    }

    public static final g0 a0(PreviewFragment previewFragment, ng.d video) {
        s.h(video, "video");
        previewFragment.s0(video);
        return g0.f38750a;
    }

    public static final g0 b0(PreviewFragment previewFragment) {
        previewFragment.V();
        return g0.f38750a;
    }

    public static final g0 c0(PreviewFragment previewFragment, Integer num) {
        ph.l lVar = previewFragment.videosAdapter;
        if (lVar == null) {
            s.w("videosAdapter");
            lVar = null;
        }
        s.e(num);
        lVar.j(num.intValue());
        return g0.f38750a;
    }

    public static final void d0(PreviewFragment previewFragment, String str, Bundle bundle) {
        s.h(str, "<unused var>");
        s.h(bundle, "bundle");
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("video_list", ng.d.class) : bundle.getParcelableArrayList("video_list");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            return;
        }
        previewFragment.Y(parcelableArrayList);
    }

    public static final void e0(PreviewFragment previewFragment, String str) {
        if (previewFragment.isAdded()) {
            previewFragment.k0(str);
        }
    }

    public static /* synthetic */ void l0(PreviewFragment previewFragment, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "editor_toolbar";
        }
        previewFragment.k0(str);
    }

    private final void q0(ng.d video) {
        int iIndexOf = v().k1().indexOf(video);
        v().O1(video);
        ph.l lVar = this.videosAdapter;
        ph.l lVar2 = null;
        if (lVar == null) {
            s.w("videosAdapter");
            lVar = null;
        }
        lVar.notifyItemRemoved(iIndexOf);
        if (v().k1().size() == 1) {
            ph.l lVar3 = this.videosAdapter;
            if (lVar3 == null) {
                s.w("videosAdapter");
            } else {
                lVar2 = lVar3;
            }
            lVar2.notifyItemChanged(0);
        } else {
            ph.l lVar4 = this.videosAdapter;
            if (lVar4 == null) {
                s.w("videosAdapter");
                lVar4 = null;
            }
            if (iIndexOf == lVar4.k()) {
                ph.l lVar5 = this.videosAdapter;
                if (lVar5 == null) {
                    s.w("videosAdapter");
                } else {
                    lVar2 = lVar5;
                }
                lVar2.notifyItemChanged(iIndexOf);
            }
        }
        u0();
    }

    private final void s0(ng.d video) {
        v().U1(video);
    }

    private final void t0() {
        androidx.fragment.app.s sVarRequireActivity = requireActivity();
        s.g(sVarRequireActivity, "requireActivity(...)");
        sVarRequireActivity.addMenuProvider(new c(), getViewLifecycleOwner(), androidx.lifecycle.s.b.RESUMED);
    }

    private final void u0() {
        List listK1 = v().k1();
        if (listK1.size() <= 1) {
            ((s4) w()).F.J(new long[0], new boolean[0]);
            return;
        }
        int size = listK1.size() - 1;
        long[] jArr = new long[size];
        boolean[] zArr = new boolean[listK1.size() - 1];
        long jY = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jY += ((ng.d) listK1.get(i10)).y() - ((ng.d) listK1.get(i10)).z();
            jArr[i10] = jY;
        }
        ((s4) w()).F.J(jArr, zArr);
    }

    public final void Q() {
        v().s1();
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public s4 x(LayoutInflater layoutInflater, ViewGroup container) {
        s.h(layoutInflater, "layoutInflater");
        s4 s4VarY = s4.Y(layoutInflater, container, false);
        s.g(s4VarY, "inflate(...)");
        return s4VarY;
    }

    public final void f0() {
        androidx.navigation.fragment.a.a(this).F(R.id.action_editorPreviewFragment_to_addBackgroundFragment);
    }

    public final void g0() {
        androidx.navigation.fragment.a.a(this).F(R.id.action_editorPreviewFragment_to_addAudioFragment);
    }

    public final void h0() {
        androidx.navigation.fragment.a.a(this).F(R.id.action_editorPreviewFragment_to_addStickerFragment);
    }

    public final void i0() {
        androidx.navigation.fragment.a.a(this).F(R.id.action_editorPreviewFragment_to_addTextFragment);
    }

    public final void j0() {
        l0(this, null, 1, null);
    }

    public final void k0(String source) {
        s.h(source, "source");
        nf.l lVar = nf.l.f47604a;
        Context contextRequireContext = requireContext();
        s.g(contextRequireContext, "requireContext(...)");
        lVar.x(contextRequireContext, source);
        androidx.navigation.fragment.a.a(this).F(R.id.action_editorPreviewFragment_to_autoCaptionFragment);
    }

    public final void m0() {
        androidx.navigation.fragment.a.a(this).F(R.id.action_editorPreviewFragment_to_cropFragment);
    }

    public final void n0() {
        androidx.navigation.fragment.a.a(this).F(R.id.action_editorPreviewFragment_to_ratioFragment);
    }

    public final void o0() {
        androidx.navigation.fragment.a.a(this).F(R.id.action_editorPreviewFragment_to_changeSpeedFragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            EditVideoActivity editVideoActivity = (EditVideoActivity) activity;
            androidx.appcompat.app.a aVarL0 = editVideoActivity.l0();
            if (aVarL0 != null) {
                aVarL0.F();
            }
            androidx.appcompat.app.a aVarL1 = editVideoActivity.l0();
            if (aVarL1 != null) {
                aVarL1.t(true);
            }
            final View rootView = editVideoActivity.findViewById(android.R.id.content).getRootView();
            rootView.post(new Runnable() { // from class: oh.c3
                @Override // java.lang.Runnable
                public final void run() {
                    PreviewFragment.W(rootView, this);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        androidx.appcompat.app.a aVarL0;
        super.onStop();
        androidx.fragment.app.s activity = getActivity();
        if (activity == null || (aVarL0 = ((EditVideoActivity) activity).l0()) == null) {
            return;
        }
        aVarL0.k();
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        final String strV0;
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        s4 s4Var = (s4) w();
        s4Var.b0(v());
        s4Var.a0(this);
        this.videosAdapter = new ph.l(new Function1() { // from class: oh.d3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewFragment.Z(this.f48646a, (ng.d) obj);
            }
        }, new Function1() { // from class: oh.e3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewFragment.a0(this.f48653a, (ng.d) obj);
            }
        });
        o oVar = new o(new tl.a() { // from class: oh.f3
            @Override // tl.a
            public final Object invoke() {
                return PreviewFragment.b0(this.f48659a);
            }
        });
        ph.l lVar = this.videosAdapter;
        if (lVar == null) {
            s.w("videosAdapter");
            lVar = null;
        }
        ((s4) w()).G.setAdapter(new androidx.recyclerview.widget.g(lVar, oVar));
        ph.l lVar2 = this.videosAdapter;
        if (lVar2 == null) {
            s.w("videosAdapter");
            lVar2 = null;
        }
        lVar2.i(v().k1());
        u0();
        v().D0().j(getViewLifecycleOwner(), new b(new Function1() { // from class: oh.g3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewFragment.c0(this.f48669a, (Integer) obj);
            }
        }));
        ((s4) w()).F.setShowMultiWindowTimeBar(true);
        i0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.g(viewLifecycleOwner, new a());
        t0();
        getChildFragmentManager().z1("req_video_multi", getViewLifecycleOwner(), new k0() { // from class: oh.h3
            @Override // androidx.fragment.app.k0
            public final void a(String str, Bundle bundle) {
                PreviewFragment.d0(this.f48692a, str, bundle);
            }
        });
        if (savedInstanceState != null || (strV0 = v().V0()) == null) {
            return;
        }
        v().b2(null);
        view.post(new Runnable() { // from class: oh.i3
            @Override // java.lang.Runnable
            public final void run() {
                PreviewFragment.e0(this.f48698a, strV0);
            }
        });
    }

    public final void p0() {
        androidx.navigation.fragment.a.a(this).F(R.id.action_editorPreviewFragment_to_trimFragment);
    }

    public final void r0() {
        v().h0();
    }
}
