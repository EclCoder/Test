package w1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f55795a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f55796b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f55797c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f55798d = Collections.EMPTY_LIST;

    public void a(Object obj) {
        synchronized (this.f55795a) {
            try {
                ArrayList arrayList = new ArrayList(this.f55798d);
                arrayList.add(obj);
                this.f55798d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f55796b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f55797c);
                    hashSet.add(obj);
                    this.f55797c = Collections.unmodifiableSet(hashSet);
                }
                this.f55796b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Object obj) {
        synchronized (this.f55795a) {
            try {
                Integer num = (Integer) this.f55796b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f55798d);
                arrayList.remove(obj);
                this.f55798d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f55796b.remove(obj);
                    HashSet hashSet = new HashSet(this.f55797c);
                    hashSet.remove(obj);
                    this.f55797c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f55796b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int g0(Object obj) {
        int iIntValue;
        synchronized (this.f55795a) {
            try {
                iIntValue = this.f55796b.containsKey(obj) ? ((Integer) this.f55796b.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f55795a) {
            it = this.f55798d.iterator();
        }
        return it;
    }

    public Set l() {
        Set set;
        synchronized (this.f55795a) {
            set = this.f55797c;
        }
        return set;
    }
}
