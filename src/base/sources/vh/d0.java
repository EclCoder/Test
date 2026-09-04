package vh;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends Fragment implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f55580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f55581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55582c;

    public static void b(Activity activity, ArrayList arrayList, i iVar) {
        d0 d0Var = new d0();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("request_permissions", arrayList);
        d0Var.setArguments(bundle);
        d0Var.setRetainInstance(true);
        d0Var.e(true);
        d0Var.d(iVar);
        d0Var.a(activity);
    }

    public void a(Activity activity) {
        activity.getFragmentManager().beginTransaction().add(this, toString()).commitAllowingStateLoss();
    }

    public void c(Activity activity) {
        activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    public void d(i iVar) {
        this.f55580a = iVar;
    }

    public void e(boolean z10) {
        this.f55581b = z10;
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        ArrayList<String> stringArrayList;
        if (i10 != 1025) {
            return;
        }
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null || (stringArrayList = arguments.getStringArrayList("request_permissions")) == null || stringArrayList.isEmpty()) {
            return;
        }
        e0.s(stringArrayList, this);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f55581b) {
            c(getActivity());
            return;
        }
        if (this.f55582c) {
            return;
        }
        this.f55582c = true;
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (arguments == null || activity == null) {
            return;
        }
        g0.f(this, e0.l(getActivity(), arguments.getStringArrayList("request_permissions")), 1025);
    }

    @Override // java.lang.Runnable
    public void run() {
        Activity activity;
        if (isAdded() && (activity = getActivity()) != null) {
            i iVar = this.f55580a;
            this.f55580a = null;
            if (iVar == null) {
                c(activity);
                return;
            }
            ArrayList<String> stringArrayList = getArguments().getStringArrayList("request_permissions");
            if (k.c(activity, stringArrayList).size() == stringArrayList.size()) {
                iVar.a();
            } else {
                iVar.b();
            }
            c(activity);
        }
    }
}
