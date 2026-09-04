package vh;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class y extends Fragment implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f55606g = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f55607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f55608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f55610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f55611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55612f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements e {
        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f55614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f55615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f55616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f55617d;

        b(Activity activity, ArrayList arrayList, ArrayList arrayList2, int i10) {
            this.f55614a = activity;
            this.f55615b = arrayList;
            this.f55616c = arrayList2;
            this.f55617d = i10;
        }

        public static /* synthetic */ void c(b bVar, Activity activity, ArrayList arrayList, ArrayList arrayList2, int i10) {
            bVar.getClass();
            y.c(activity, arrayList, new a0(bVar), new b0(bVar, arrayList2, i10, arrayList));
        }

        @Override // vh.h
        public void a(List list, boolean z10) {
            if (y.this.isAdded()) {
                int[] iArr = new int[this.f55616c.size()];
                Arrays.fill(iArr, -1);
                y.this.onRequestPermissionsResult(this.f55617d, (String[]) this.f55616c.toArray(new String[0]), iArr);
            }
        }

        @Override // vh.h
        public void b(List list, boolean z10) {
            if (z10 && y.this.isAdded()) {
                long j10 = c.f() ? 150L : 0L;
                final Activity activity = this.f55614a;
                final ArrayList arrayList = this.f55615b;
                final ArrayList arrayList2 = this.f55616c;
                final int i10 = this.f55617d;
                e0.t(new Runnable() { // from class: vh.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.b.c(this.f55619a, activity, arrayList, arrayList2, i10);
                    }
                }, j10);
            }
        }
    }

    public static void c(Activity activity, ArrayList arrayList, e eVar, h hVar) {
        int iNextInt;
        List list;
        y yVar = new y();
        Bundle bundle = new Bundle();
        do {
            iNextInt = new Random().nextInt((int) Math.pow(2.0d, 8.0d));
            list = f55606g;
        } while (list.contains(Integer.valueOf(iNextInt)));
        list.add(Integer.valueOf(iNextInt));
        bundle.putInt("request_code", iNextInt);
        bundle.putStringArrayList("request_permissions", arrayList);
        yVar.setArguments(bundle);
        yVar.setRetainInstance(true);
        yVar.h(true);
        yVar.f(hVar);
        yVar.g(eVar);
        yVar.a(activity);
    }

    public void a(Activity activity) {
        activity.getFragmentManager().beginTransaction().add(this, toString()).commitAllowingStateLoss();
    }

    public void b(Activity activity) {
        activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    public void d() {
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null) {
            return;
        }
        int i10 = arguments.getInt("request_code");
        ArrayList<String> stringArrayList = arguments.getStringArrayList("request_permissions");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return;
        }
        if (!c.l()) {
            int size = stringArrayList.size();
            int[] iArr = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = k.f(activity, stringArrayList.get(i11)) ? 0 : -1;
            }
            onRequestPermissionsResult(i10, (String[]) stringArrayList.toArray(new String[0]), iArr);
            return;
        }
        if (c.f() && stringArrayList.size() >= 2 && e0.f(stringArrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
            ArrayList arrayList = new ArrayList(stringArrayList);
            arrayList.remove("android.permission.BODY_SENSORS_BACKGROUND");
            i(activity, stringArrayList, arrayList, i10);
            return;
        }
        if (c.c() && stringArrayList.size() >= 2 && e0.f(stringArrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            ArrayList arrayList2 = new ArrayList(stringArrayList);
            arrayList2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
            i(activity, stringArrayList, arrayList2, i10);
        } else {
            if (!c.c() || !e0.f(stringArrayList, "android.permission.ACCESS_MEDIA_LOCATION") || !e0.f(stringArrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                requestPermissions((String[]) stringArrayList.toArray(new String[stringArrayList.size() - 1]), i10);
                return;
            }
            ArrayList arrayList3 = new ArrayList(stringArrayList);
            arrayList3.remove("android.permission.ACCESS_MEDIA_LOCATION");
            i(activity, stringArrayList, arrayList3, i10);
        }
    }

    public void e() {
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (arguments == null || activity == null) {
            return;
        }
        ArrayList<String> stringArrayList = arguments.getStringArrayList("request_permissions");
        int size = stringArrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            String str = stringArrayList.get(i10);
            i10++;
            String str2 = str;
            if (k.j(str2) && !k.f(activity, str2) && (c.d() || !e0.g(str2, "android.permission.MANAGE_EXTERNAL_STORAGE"))) {
                g0.f(this, e0.l(activity, e0.b(str2)), getArguments().getInt("request_code"));
                z10 = true;
            }
        }
        if (z10) {
            return;
        }
        d();
    }

    public void f(h hVar) {
        this.f55610d = hVar;
    }

    public void g(e eVar) {
        this.f55611e = eVar;
    }

    public void h(boolean z10) {
        this.f55609c = z10;
    }

    public void i(Activity activity, ArrayList arrayList, ArrayList arrayList2, int i10) {
        ArrayList arrayList3 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList3.remove((String) obj);
        }
        c(activity, arrayList2, new a(), new b(activity, arrayList3, arrayList, i10));
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        ArrayList<String> stringArrayList;
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null || this.f55608b || i10 != arguments.getInt("request_code") || (stringArrayList = arguments.getStringArrayList("request_permissions")) == null || stringArrayList.isEmpty()) {
            return;
        }
        this.f55608b = true;
        e0.s(stringArrayList, this);
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        int requestedOrientation = activity.getRequestedOrientation();
        this.f55612f = requestedOrientation;
        if (requestedOrientation != -1) {
            return;
        }
        e0.q(activity);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f55610d = null;
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        Activity activity = getActivity();
        if (activity == null || this.f55612f != -1 || activity.getRequestedOrientation() == -1) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (activity == null || arguments == null || this.f55611e == null || i10 != arguments.getInt("request_code")) {
            return;
        }
        h hVar = this.f55610d;
        this.f55610d = null;
        e eVar = this.f55611e;
        this.f55611e = null;
        e0.r(activity, strArr, iArr);
        ArrayList arrayListB = e0.b(strArr);
        f55606g.remove(Integer.valueOf(i10));
        b(activity);
        List listD = k.d(arrayListB, iArr);
        if (listD.size() == arrayListB.size()) {
            eVar.a(activity, arrayListB, listD, true, hVar);
            eVar.c(activity, arrayListB, false, hVar);
            return;
        }
        List listB = k.b(arrayListB, iArr);
        eVar.b(activity, arrayListB, listB, k.i(activity, listB), hVar);
        if (!listD.isEmpty()) {
            eVar.a(activity, arrayListB, listD, false, hVar);
        }
        eVar.c(activity, arrayListB, false, hVar);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f55609c) {
            b(getActivity());
        } else {
            if (this.f55607a) {
                return;
            }
            this.f55607a = true;
            e();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isAdded()) {
            d();
        }
    }
}
