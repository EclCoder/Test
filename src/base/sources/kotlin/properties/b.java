package kotlin.properties;

import kotlin.jvm.internal.s;
import re.xQrM.UoyZyZEcGYBpIg;
import zl.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements c {
    private Object value;

    public b(Object obj) {
        this.value = obj;
    }

    protected abstract void afterChange(k kVar, Object obj, Object obj2);

    protected boolean beforeChange(k property, Object obj, Object obj2) {
        s.h(property, "property");
        return true;
    }

    public void setValue(Object obj, k property, Object obj2) {
        s.h(property, "property");
        Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }

    @Override // kotlin.properties.c
    public Object getValue(Object obj, k kVar) {
        s.h(kVar, UoyZyZEcGYBpIg.yiJfgf);
        return this.value;
    }
}
