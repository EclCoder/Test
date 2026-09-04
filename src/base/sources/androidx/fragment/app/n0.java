package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f4201a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f4202b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f4203c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i0 f4204d;

    n0() {
    }

    void A(i0 i0Var) {
        this.f4204d = i0Var;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f4203c.put(str, bundle) : (Bundle) this.f4203c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.f4201a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f4201a) {
            this.f4201a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f4202b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f4202b.get(str) != null;
    }

    void d(int i10) {
        for (m0 m0Var : this.f4202b.values()) {
            if (m0Var != null) {
                m0Var.t(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4202b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (m0 m0Var : this.f4202b.values()) {
                printWriter.print(str);
                if (m0Var != null) {
                    Fragment fragmentK = m0Var.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4201a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) this.f4201a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        m0 m0Var = (m0) this.f4202b.get(str);
        if (m0Var != null) {
            return m0Var.k();
        }
        return null;
    }

    Fragment g(int i10) {
        for (int size = this.f4201a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f4201a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (m0 m0Var : this.f4202b.values()) {
            if (m0Var != null) {
                Fragment fragmentK = m0Var.k();
                if (fragmentK.mFragmentId == i10) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f4201a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f4201a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (m0 m0Var : this.f4202b.values()) {
            if (m0Var != null) {
                Fragment fragmentK = m0Var.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (m0 m0Var : this.f4202b.values()) {
            if (m0Var != null && (fragmentFindFragmentByWho = m0Var.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f4201a.indexOf(fragment);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = (Fragment) this.f4201a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f4201a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f4201a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : this.f4202b.values()) {
            if (m0Var != null) {
                arrayList.add(m0Var);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : this.f4202b.values()) {
            if (m0Var != null) {
                arrayList.add(m0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap m() {
        return this.f4203c;
    }

    m0 n(String str) {
        return (m0) this.f4202b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f4201a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f4201a) {
            arrayList = new ArrayList(this.f4201a);
        }
        return arrayList;
    }

    i0 p() {
        return this.f4204d;
    }

    Bundle q(String str) {
        return (Bundle) this.f4203c.get(str);
    }

    void r(m0 m0Var) {
        Fragment fragmentK = m0Var.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f4202b.put(fragmentK.mWho, m0Var);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.f4204d.j(fragmentK);
            } else {
                this.f4204d.t(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (f0.N0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void s(m0 m0Var) {
        Fragment fragmentK = m0Var.k();
        if (fragmentK.mRetainInstance) {
            this.f4204d.t(fragmentK);
        }
        if (this.f4202b.get(fragmentK.mWho) == m0Var && ((m0) this.f4202b.put(fragmentK.mWho, null)) != null && f0.N0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void t() {
        ArrayList arrayList = this.f4201a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m0 m0Var = (m0) this.f4202b.get(((Fragment) obj).mWho);
            if (m0Var != null) {
                m0Var.m();
            }
        }
        for (m0 m0Var2 : this.f4202b.values()) {
            if (m0Var2 != null) {
                m0Var2.m();
                Fragment fragmentK = m0Var2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.f4203c.containsKey(fragmentK.mWho)) {
                        B(fragmentK.mWho, m0Var2.r());
                    }
                    s(m0Var2);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.f4201a) {
            this.f4201a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void v() {
        this.f4202b.clear();
    }

    void w(List list) {
        this.f4201a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (f0.N0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    void x(HashMap map) {
        this.f4203c.clear();
        this.f4203c.putAll(map);
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f4202b.size());
        for (m0 m0Var : this.f4202b.values()) {
            if (m0Var != null) {
                Fragment fragmentK = m0Var.k();
                B(fragmentK.mWho, m0Var.r());
                arrayList.add(fragmentK.mWho);
                if (f0.N0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.f4201a) {
            try {
                if (this.f4201a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f4201a.size());
                ArrayList arrayList2 = this.f4201a;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    Fragment fragment = (Fragment) obj;
                    arrayList.add(fragment.mWho);
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
