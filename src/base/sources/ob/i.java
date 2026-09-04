package ob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48386a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f48387b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f48388c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f48389d = Collections.EMPTY_LIST;

    public void a(Object obj) {
        synchronized (this.f48386a) {
            try {
                ArrayList arrayList = new ArrayList(this.f48389d);
                arrayList.add(obj);
                this.f48389d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f48387b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f48388c);
                    hashSet.add(obj);
                    this.f48388c = Collections.unmodifiableSet(hashSet);
                }
                this.f48387b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Object obj) {
        synchronized (this.f48386a) {
            try {
                Integer num = (Integer) this.f48387b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f48389d);
                arrayList.remove(obj);
                this.f48389d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f48387b.remove(obj);
                    HashSet hashSet = new HashSet(this.f48388c);
                    hashSet.remove(obj);
                    this.f48388c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f48387b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int g0(Object obj) {
        int iIntValue;
        synchronized (this.f48386a) {
            try {
                iIntValue = this.f48387b.containsKey(obj) ? ((Integer) this.f48387b.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f48386a) {
            it = this.f48389d.iterator();
        }
        return it;
    }

    public Set l() {
        Set set;
        synchronized (this.f48386a) {
            set = this.f48388c;
        }
        return set;
    }
}
