package com.googlecode.mp4parser;

import np.a;
import org.mp4parser.aspectj.lang.NoAspectBoundException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class RequiresParseDetailAspect {
    private static /* synthetic */ Throwable ajc$initFailureCause;
    public static final /* synthetic */ RequiresParseDetailAspect ajc$perSingletonInstance = null;

    static {
        try {
            ajc$postClinit();
        } catch (Throwable th2) {
            ajc$initFailureCause = th2;
        }
    }

    private static /* synthetic */ void ajc$postClinit() {
        ajc$perSingletonInstance = new RequiresParseDetailAspect();
    }

    public static RequiresParseDetailAspect aspectOf() {
        RequiresParseDetailAspect requiresParseDetailAspect = ajc$perSingletonInstance;
        if (requiresParseDetailAspect != null) {
            return requiresParseDetailAspect;
        }
        throw new NoAspectBoundException("com.googlecode.mp4parser.RequiresParseDetailAspect", ajc$initFailureCause);
    }

    public static boolean hasAspect() {
        return ajc$perSingletonInstance != null;
    }

    public void before(a aVar) {
        if (aVar.getTarget() instanceof AbstractBox) {
            if (((AbstractBox) aVar.getTarget()).isParsed()) {
                return;
            }
            ((AbstractBox) aVar.getTarget()).parseDetails();
        } else {
            throw new RuntimeException("Only methods in subclasses of " + AbstractBox.class.getName() + " can  be annotated with ParseDetail");
        }
    }
}
