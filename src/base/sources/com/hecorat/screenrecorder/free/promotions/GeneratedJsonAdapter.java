package com.hecorat.screenrecorder.free.promotions;

import com.squareup.moshi.f;
import com.squareup.moshi.i;
import com.squareup.moshi.o;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import gl.s0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vj.c;

/* JADX INFO: renamed from: com.hecorat.screenrecorder.free.promotions.UtilityCatalogJsonAdapter, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalogJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalog;", "Lcom/squareup/moshi/r;", "moshi", "<init>", "(Lcom/squareup/moshi/r;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/i;", "reader", "fromJson", "(Lcom/squareup/moshi/i;)Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalog;", "Lcom/squareup/moshi/o;", "writer", "value_", "Lfl/g0;", "toJson", "(Lcom/squareup/moshi/o;Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalog;)V", "Lcom/squareup/moshi/i$a;", "options", "Lcom/squareup/moshi/i$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "", "Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalogEntry;", "listOfUtilityCatalogEntryAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GeneratedJsonAdapter extends f {
    private volatile Constructor<UtilityCatalog> constructorRef;
    private final f intAdapter;
    private final f listOfUtilityCatalogEntryAdapter;
    private final i.a options;

    public GeneratedJsonAdapter(r moshi) {
        s.h(moshi, "moshi");
        i.a aVarA = i.a.a("version", "items");
        s.g(aVarA, "of(...)");
        this.options = aVarA;
        f fVarF = moshi.f(Integer.TYPE, s0.d(), "version");
        s.g(fVarF, "adapter(...)");
        this.intAdapter = fVarF;
        f fVarF2 = moshi.f(u.j(List.class, UtilityCatalogEntry.class), s0.d(), "items");
        s.g(fVarF2, "adapter(...)");
        this.listOfUtilityCatalogEntryAdapter = fVarF2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UtilityCatalog");
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.squareup.moshi.f
    public UtilityCatalog fromJson(i reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        s.h(reader, "reader");
        Integer num = 0;
        reader.h();
        List list = null;
        int i10 = -1;
        while (reader.q()) {
            int iN0 = reader.N0(this.options);
            if (iN0 == -1) {
                reader.W0();
                reader.X0();
            } else if (iN0 == 0) {
                num = (Integer) this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.v("version", "version", reader);
                }
                i10 &= -2;
            } else if (iN0 == 1) {
                list = (List) this.listOfUtilityCatalogEntryAdapter.fromJson(reader);
                if (list == null) {
                    throw c.v("items", "items", reader);
                }
                i10 &= -3;
            } else {
                continue;
            }
        }
        reader.l();
        if (i10 == -4) {
            int iIntValue = num.intValue();
            s.f(list, "null cannot be cast to non-null type kotlin.collections.List<com.hecorat.screenrecorder.free.promotions.UtilityCatalogEntry>");
            return new UtilityCatalog(iIntValue, list);
        }
        Constructor<UtilityCatalog> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = c.f55653c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = UtilityCatalog.class.getDeclaredConstructor(cls2, List.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            s.g(declaredConstructor, "also(...)");
        }
        UtilityCatalog utilityCatalogNewInstance = declaredConstructor.newInstance(num, list, Integer.valueOf(i10), null);
        s.g(utilityCatalogNewInstance, "newInstance(...)");
        return utilityCatalogNewInstance;
    }

    @Override // com.squareup.moshi.f
    public void toJson(o writer, UtilityCatalog value_) {
        s.h(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.t("version");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getVersion()));
        writer.t("items");
        this.listOfUtilityCatalogEntryAdapter.toJson(writer, value_.getItems());
        writer.m();
    }
}
