package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class z implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f3779a;

    public z(Iterator it) {
        this.f3779a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f3779a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3779a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f3779a.remove();
    }
}
