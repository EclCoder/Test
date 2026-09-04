package h6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r5.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f40250a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f40251b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f40252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f40253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final i f40254c;

        public a(Class cls, Class cls2, i iVar) {
            this.f40252a = cls;
            this.f40253b = cls2;
            this.f40254c = iVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f40252a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f40253b);
        }
    }

    private synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.f40250a.contains(str)) {
                this.f40250a.add(str);
            }
            arrayList = (List) this.f40251b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f40251b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized void a(String str, i iVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, iVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f40250a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f40251b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f40254c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f40250a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f40251b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f40253b)) {
                        arrayList.add(aVar.f40253b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List list) {
        try {
            ArrayList arrayList = new ArrayList(this.f40250a);
            this.f40250a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f40250a.add((String) it.next());
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                if (!list.contains(str)) {
                    this.f40250a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
