package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.p1;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class i0 extends p1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final s1.c f4141i = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f4145e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f4142b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f4143c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f4144d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4146f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4147g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4148h = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements s1.c {
        a() {
        }

        @Override // androidx.lifecycle.s1.c
        public p1 a(Class cls) {
            return new i0(true);
        }
    }

    i0(boolean z10) {
        this.f4145e = z10;
    }

    private void m(String str, boolean z10) {
        i0 i0Var = (i0) this.f4143c.get(str);
        if (i0Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(i0Var.f4143c.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    i0Var.l((String) obj, true);
                }
            }
            i0Var.g();
            this.f4143c.remove(str);
        }
        t1 t1Var = (t1) this.f4144d.get(str);
        if (t1Var != null) {
            t1Var.a();
            this.f4144d.remove(str);
        }
    }

    static i0 p(t1 t1Var) {
        return (i0) new s1(t1Var, f4141i).a(i0.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f4142b.equals(i0Var.f4142b) && this.f4143c.equals(i0Var.f4143c) && this.f4144d.equals(i0Var.f4144d)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.p1
    protected void g() {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4146f = true;
    }

    public int hashCode() {
        return (((this.f4142b.hashCode() * 31) + this.f4143c.hashCode()) * 31) + this.f4144d.hashCode();
    }

    void j(Fragment fragment) {
        if (this.f4148h) {
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4142b.containsKey(fragment.mWho)) {
                return;
            }
            this.f4142b.put(fragment.mWho, fragment);
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void k(Fragment fragment, boolean z10) {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m(fragment.mWho, z10);
    }

    void l(String str, boolean z10) {
        if (f0.N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m(str, z10);
    }

    Fragment n(String str) {
        return (Fragment) this.f4142b.get(str);
    }

    i0 o(Fragment fragment) {
        i0 i0Var = (i0) this.f4143c.get(fragment.mWho);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(this.f4145e);
        this.f4143c.put(fragment.mWho, i0Var2);
        return i0Var2;
    }

    Collection q() {
        return new ArrayList(this.f4142b.values());
    }

    t1 r(Fragment fragment) {
        t1 t1Var = (t1) this.f4144d.get(fragment.mWho);
        if (t1Var != null) {
            return t1Var;
        }
        t1 t1Var2 = new t1();
        this.f4144d.put(fragment.mWho, t1Var2);
        return t1Var2;
    }

    boolean s() {
        return this.f4146f;
    }

    void t(Fragment fragment) {
        if (this.f4148h) {
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4142b.remove(fragment.mWho) == null || !f0.N0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f4142b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f4143c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f4144d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    void u(boolean z10) {
        this.f4148h = z10;
    }

    boolean v(Fragment fragment) {
        if (this.f4142b.containsKey(fragment.mWho)) {
            return this.f4145e ? this.f4146f : !this.f4147g;
        }
        return true;
    }
}
