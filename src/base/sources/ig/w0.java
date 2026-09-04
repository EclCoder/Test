package ig;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.HomeActivity;
import java.util.ArrayList;
import java.util.List;
import tf.m5;
import tf.w2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class w0 extends Fragment implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kf.p0 f41405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.recyclerview.widget.g f41406b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m5 f41409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    lg.a f41410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    lg.x f41411g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kf.q f41407c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private kf.r0 f41408d = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final vh.h f41412h = new vh.h() { // from class: ig.s0
        @Override // vh.h
        public final void b(List list, boolean z10) {
            w0.s(this.f41397a, list, z10);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f41413i = new View.OnClickListener() { // from class: ig.t0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            w0.x(view);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends RecyclerView.v {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            HomeActivity homeActivity = (HomeActivity) w0.this.getActivity();
            if (homeActivity == null) {
                return;
            }
            if (i11 > 0) {
                homeActivity.j1(true);
            } else if (i11 < 0 || !recyclerView.canScrollVertically(-1)) {
                homeActivity.j1(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends GridLayoutManager.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f41415e;

        b(int i10) {
            this.f41415e = i10;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i10) {
            int itemCount = w0.this.f41408d != null ? w0.this.f41408d.getItemCount() : 0;
            if (w0.this.f41407c != null) {
                itemCount += w0.this.f41407c.getItemCount();
            }
            if (i10 < itemCount) {
                return this.f41415e;
            }
            int itemViewType = w0.this.f41405a.getItemViewType(i10 - itemCount);
            if (itemViewType == 5 || itemViewType == 4) {
                return this.f41415e;
            }
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fl.g0 D() {
        w2 w2VarY = w2.Y(getLayoutInflater());
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), R.style.GeneralDialogTheme);
        builder.setView(w2VarY.B());
        final AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        w2VarY.A.setOnClickListener(new View.OnClickListener() { // from class: ig.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                alertDialogCreate.dismiss();
            }
        });
        w2VarY.F.setOnClickListener(new View.OnClickListener() { // from class: ig.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w0.y(this.f41402a, alertDialogCreate, view);
            }
        });
        return fl.g0.f38750a;
    }

    private GridLayoutManager I(int i10) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), i10);
        gridLayoutManager.o0(new b(i10));
        return gridLayoutManager;
    }

    private void J() {
        this.f41406b.h(this.f41407c);
        this.f41407c = null;
        nh.l0.A(getActivity(), "grant_permission_storage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fl.g0 K() {
        nh.h0.b(this, this.f41412h);
        return fl.g0.f38750a;
    }

    private void N() {
        long jE = nh.e.e(this.f41410f, getActivity());
        this.f41409e.G.setProgress((int) (100 - ((jE * 100) / nh.e.v(this.f41410f, getActivity()))));
        this.f41409e.B.setText(getString(R.string.available_storage, nh.e.u(jE)));
        this.f41409e.A.setText(getString(R.string.time_can_be_recorded_in_bracket, nh.e.j(this.f41410f, jE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(boolean z10) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f41409e.C.setVisibility(z10 ? 8 : 0);
        } else if (androidx.core.content.a.checkSelfPermission(AzRecorderApp.e().getApplicationContext(), "android.permission.READ_EXTERNAL_STORAGE") != 0 || z10) {
            this.f41409e.C.setVisibility(8);
        } else {
            this.f41409e.C.setVisibility(0);
        }
    }

    public static /* synthetic */ void q(w0 w0Var) {
        w0Var.M();
        w0Var.f41409e.H.setRefreshing(false);
    }

    public static /* synthetic */ void s(w0 w0Var, List list, boolean z10) {
        if (z10) {
            w0Var.J();
        } else {
            w0Var.getClass();
        }
    }

    public static /* synthetic */ void t(w0 w0Var, ArrayList arrayList) {
        w0Var.f41405a.x(arrayList);
        if (w0Var.f41409e == null) {
            return;
        }
        w0Var.O(!arrayList.isEmpty());
        w0Var.f41409e.D.setVisibility(8);
        w0Var.f41409e.E.A.setVisibility(8);
    }

    public static /* synthetic */ void x(View view) {
        if (view.getId() == R.id.turn_on_tv) {
            lg.c.m(null);
        }
    }

    public static /* synthetic */ void y(w0 w0Var, AlertDialog alertDialog, View view) {
        w0Var.getClass();
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
        intent.putExtra("extra_pkgname", w0Var.getContext().getPackageName());
        w0Var.startActivityForResult(intent, 4231);
        alertDialog.dismiss();
    }

    public void E(boolean z10) {
        try {
            this.f41405a.t(z10);
        } catch (NullPointerException e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            nh.j0.b(getActivity(), R.string.toast_can_not_delete_file_now);
        }
    }

    public void F() {
        try {
            this.f41405a.w();
        } catch (NullPointerException e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            nh.j0.b(getActivity(), R.string.toast_can_not_delete_file_now);
        }
    }

    public void G() {
        m5 m5Var = this.f41409e;
        if (m5Var == null) {
            return;
        }
        m5Var.D.setVisibility(0);
        new mf.l().j(new mf.l.b() { // from class: ig.n0
            @Override // mf.l.b
            public final void a(ArrayList arrayList) {
                w0.t(this.f41385a, arrayList);
            }
        });
    }

    public kf.p0 H() {
        return this.f41405a;
    }

    public void L() {
        try {
            this.f41405a.H();
        } catch (NullPointerException e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            nh.j0.b(getActivity(), R.string.toast_can_not_rename_file);
        }
    }

    public void M() {
        if (lg.c.b(getActivity())) {
            G();
            return;
        }
        this.f41409e.E.A.setVisibility(0);
        this.f41409e.C.setVisibility(8);
        this.f41409e.D.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 4231 || nh.l0.p(getContext())) {
            return;
        }
        this.f41406b.h(this.f41408d);
        this.f41408d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AzRecorderApp.d().m(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m5 m5Var = (m5) androidx.databinding.g.h(layoutInflater, R.layout.fragment_video_gallery, viewGroup, false);
        this.f41409e = m5Var;
        m5Var.A.setSelected(true);
        N();
        return this.f41409e.B();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f41410f.f().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f41409e = null;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (isAdded()) {
            try {
                if (str.contains("com.facebook")) {
                    return;
                }
                if (!str.equals(getString(R.string.pref_bitrate)) && !str.equals(getString(R.string.pref_resolution)) && !str.equals(getString(R.string.pref_use_internal_storage))) {
                    return;
                }
                N();
            } catch (Exception e10) {
                wp.a.e(e10);
                wp.a.a("Preference key: %s", str);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f41409e.H.setColorSchemeColors(new lg.h(requireActivity()).a().data);
        this.f41409e.I.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f41405a = new kf.p0(this, this.f41411g, this.f41410f, new kf.p0.c() { // from class: ig.o0
            @Override // kf.p0.c
            public final void a(boolean z10) {
                this.f41388a.O(z10);
            }
        });
        this.f41406b = new androidx.recyclerview.widget.g(new RecyclerView.h[0]);
        if (nh.l0.p(getContext())) {
            kf.r0 r0Var = new kf.r0(new tl.a() { // from class: ig.p0
                @Override // tl.a
                public final Object invoke() {
                    return this.f41391a.D();
                }
            });
            this.f41408d = r0Var;
            this.f41406b.f(r0Var);
        }
        if (Build.VERSION.SDK_INT >= 30 && !vh.i0.e(requireActivity(), "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES")) {
            kf.q qVar = new kf.q(new tl.a() { // from class: ig.q0
                @Override // tl.a
                public final Object invoke() {
                    return this.f41394a.K();
                }
            });
            this.f41407c = qVar;
            this.f41406b.f(qVar);
        }
        this.f41406b.f(this.f41405a);
        this.f41409e.I.setAdapter(this.f41406b);
        M();
        this.f41409e.H.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: ig.r0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                w0.q(this.f41395a);
            }
        });
        this.f41409e.E.B.setOnClickListener(this.f41413i);
        this.f41410f.f().registerOnSharedPreferenceChangeListener(this);
        int iH = nh.b.h(getContext()) / 350;
        if (iH >= 2) {
            this.f41409e.I.setLayoutManager(I(iH));
        }
        this.f41409e.I.n(new a());
        HomeActivity homeActivity = (HomeActivity) getActivity();
        if (homeActivity != null) {
            homeActivity.z1(0, this);
        }
    }
}
