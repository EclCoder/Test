package com.hecorat.screenrecorder.free.videoeditor;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.q0;
import androidx.lifecycle.s1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fl.g0;
import fl.w;
import gl.r;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import oh.o2;
import ph.f0;
import tf.q5;
import uh.m0;
import uh.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/m;", "Loh/o2;", "Ltf/q5;", "<init>", "()V", "Lng/d;", "item", "Lfl/g0;", "L", "(Lng/d;)V", "K", "", "count", "Q", "(I)V", "H", "getTheme", "()I", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", "J", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/q5;", "Luh/m0;", "v", "()Luh/m0;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lph/f0;", "c", "Lph/f0;", "adapter", "Luh/r0;", "I", "()Luh/r0;", "videoViewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends o2<q5> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public f0 adapter;

    /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.m$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(boolean z10) {
            m mVar = new m();
            mVar.setArguments(j0.e.a(w.a("isSingleSelection", Boolean.valueOf(z10))));
            return mVar;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.a.a(Integer.valueOf(((ng.d) obj).v()), Integer.valueOf(((ng.d) obj2).v()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements kotlin.jvm.internal.m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f23453a;

        public c(Function1 function) {
            s.h(function, "function");
            this.f23453a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f23453a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23453a.invoke(obj);
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

    private final void H(ng.d item) {
        Context contextRequireContext = requireContext();
        s.g(contextRequireContext, "requireContext(...)");
        item.F(sh.b.y(contextRequireContext, item.b()));
    }

    private final r0 I() {
        m0 m0VarX = x();
        s.f(m0VarX, "null cannot be cast to non-null type com.hecorat.screenrecorder.free.videoeditor.viewmodel.VideoPickerViewModel");
        return (r0) m0VarX;
    }

    private final void K() {
        f0 f0Var = this.adapter;
        if (f0Var == null) {
            s.w("adapter");
            f0Var = null;
        }
        List listF = f0Var.f();
        s.g(listF, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((ng.d) obj).v() > 0) {
                arrayList.add(obj);
            }
        }
        List<ng.d> listZ0 = r.z0(arrayList, new b());
        for (ng.d dVar : listZ0) {
            if (!dVar.o()) {
                s.e(dVar);
                H(dVar);
            }
        }
        getParentFragmentManager().y1("req_video_multi", j0.e.a(w.a("video_list", new ArrayList(listZ0))));
        dismiss();
    }

    private final void L(ng.d item) {
        if (I().C()) {
            H(item);
            getParentFragmentManager().y1("req_video_single", j0.e.a(w.a("video_single", item)));
            dismiss();
        } else {
            I().E(item.q());
            f0 f0Var = this.adapter;
            if (f0Var == null) {
                s.w("adapter");
                f0Var = null;
            }
            f0Var.l(item);
        }
    }

    public static final g0 M(m mVar, ng.d item) {
        s.h(item, "item");
        mVar.L(item);
        return g0.f38750a;
    }

    public static final g0 N(m mVar, List list) {
        s.e(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ng.d) {
                arrayList.add(obj);
            }
        }
        ((q5) mVar.w()).D.setVisibility(arrayList.isEmpty() ? 0 : 8);
        ((q5) mVar.w()).F.setVisibility(arrayList.isEmpty() ? 8 : 0);
        f0 f0Var = mVar.adapter;
        if (f0Var == null) {
            s.w("adapter");
            f0Var = null;
        }
        f0Var.i(arrayList);
        return g0.f38750a;
    }

    public static final g0 O(m mVar, Set set) {
        mVar.Q(set.size());
        return g0.f38750a;
    }

    public static final void P(m mVar, View view) {
        mVar.K();
    }

    private final void Q(int count) {
        if (I().C()) {
            return;
        }
        Button button = ((q5) w()).A;
        button.setText(count > 0 ? getString(R.string.add_with_count, Integer.valueOf(count)) : getString(R.string.add));
        button.setEnabled(count > 0);
        button.setBackgroundTintList(i.a.a(requireContext(), count > 0 ? R.color.sunset_orange : R.color.near_black));
    }

    @Override // oh.o2
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public q5 y(LayoutInflater layoutInflater, ViewGroup container) {
        s.h(layoutInflater, "layoutInflater");
        q5 q5VarY = q5.Y(layoutInflater, container, false);
        s.g(q5VarY, "inflate(...)");
        return q5VarY;
    }

    @Override // androidx.fragment.app.m
    public int getTheme() {
        return R.style.DarkDialogTheme;
    }

    @Override // oh.o2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        r0 r0VarI = I();
        Bundle arguments = getArguments();
        r0VarI.D(arguments != null ? arguments.getBoolean("isSingleSelection") : false);
        this.adapter = new f0(new Function1() { // from class: oh.r4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.hecorat.screenrecorder.free.videoeditor.m.M(this.f48838a, (ng.d) obj);
            }
        });
        RecyclerView recyclerView = ((q5) w()).F;
        f0 f0Var = this.adapter;
        if (f0Var == null) {
            s.w("adapter");
            f0Var = null;
        }
        recyclerView.setAdapter(f0Var);
        ((q5) w()).F.setLayoutManager(new GridLayoutManager(requireContext(), nh.b.h(getContext()) / AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
        x().s().j(getViewLifecycleOwner(), new c(new Function1() { // from class: oh.s4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.hecorat.screenrecorder.free.videoeditor.m.N(this.f48851a, (List) obj);
            }
        }));
        I().B().j(getViewLifecycleOwner(), new c(new Function1() { // from class: oh.t4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.hecorat.screenrecorder.free.videoeditor.m.O(this.f48862a, (Set) obj);
            }
        }));
        ((q5) w()).A.setVisibility(I().C() ? 4 : 0);
        ((q5) w()).A.setOnClickListener(new View.OnClickListener() { // from class: oh.u4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                com.hecorat.screenrecorder.free.videoeditor.m.P(this.f48868a, view2);
            }
        });
    }

    @Override // oh.o2
    public m0 v() {
        s1.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        s.g(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return (m0) new s1(this, defaultViewModelProviderFactory).a(r0.class);
    }
}
