package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class p {
    static final p EMPTY_REGISTRY_LITE = new p(true);
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile p emptyRegistry;
    private final Map<b, y.g> extensionsByNumber;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        static final Class<?> INSTANCE = resolveExtensionClass();

        private a() {
        }

        static Class<?> resolveExtensionClass() {
            try {
                return Class.forName(p.EXTENSION_CLASS_NAME);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        private final int number;
        private final Object object;

        b(Object obj, int i10) {
            this.object = obj;
            this.number = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.object == bVar.object && this.number == bVar.number;
        }

        public int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    p() {
        this.extensionsByNumber = new HashMap();
    }

    public static p getEmptyRegistry() {
        p pVarCreateEmpty;
        if (!doFullRuntimeInheritanceCheck) {
            return EMPTY_REGISTRY_LITE;
        }
        p pVar = emptyRegistry;
        if (pVar != null) {
            return pVar;
        }
        synchronized (p.class) {
            try {
                pVarCreateEmpty = emptyRegistry;
                if (pVarCreateEmpty == null) {
                    pVarCreateEmpty = o.createEmpty();
                    emptyRegistry = pVarCreateEmpty;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVarCreateEmpty;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static p newInstance() {
        return doFullRuntimeInheritanceCheck ? o.create() : new p();
    }

    public static void setEagerlyParseMessageSets(boolean z10) {
        eagerlyParseMessageSets = z10;
    }

    public final void add(y.g gVar) {
        this.extensionsByNumber.put(new b(gVar.getContainingTypeDefaultInstance(), gVar.getNumber()), gVar);
    }

    public <ContainingType extends s0> y.g findLiteExtensionByNumber(ContainingType containingtype, int i10) {
        return this.extensionsByNumber.get(new b(containingtype, i10));
    }

    public p getUnmodifiable() {
        return new p(this);
    }

    p(p pVar) {
        if (pVar == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.EMPTY_MAP;
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(pVar.extensionsByNumber);
        }
    }

    public final void add(n nVar) {
        if (y.g.class.isAssignableFrom(nVar.getClass())) {
            add((y.g) nVar);
        }
        if (doFullRuntimeInheritanceCheck && o.isFullRegistry(this)) {
            try {
                getClass().getMethod("add", a.INSTANCE).invoke(this, nVar);
            } catch (Exception e10) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", nVar), e10);
            }
        }
    }

    p(boolean z10) {
        this.extensionsByNumber = Collections.EMPTY_MAP;
    }
}
