package com.googlecode.mp4parser.util;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class JuliLogger extends Logger {
    java.util.logging.Logger logger;

    public JuliLogger(String str) {
        this.logger = java.util.logging.Logger.getLogger(str);
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logDebug(String str) {
        this.logger.log(Level.FINE, str);
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logError(String str) {
        this.logger.log(Level.SEVERE, str);
    }

    @Override // com.googlecode.mp4parser.util.Logger
    public void logWarn(String str) {
        this.logger.log(Level.WARNING, str);
    }
}
