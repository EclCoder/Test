package com.googlecode.mp4parser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Version {
    private static final Logger LOG = Logger.getLogger(Version.class.getName());
    public static final String VERSION;

    static {
        String line;
        try {
            line = new LineNumberReader(new InputStreamReader(Version.class.getResourceAsStream("/version.txt"))).readLine();
        } catch (IOException e10) {
            LOG.warning(e10.getMessage());
            line = "unknown";
        }
        VERSION = line;
    }
}
