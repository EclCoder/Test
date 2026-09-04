package com.google.api.client.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ExponentialBackOff implements BackOff {
    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 500;
    public static final int DEFAULT_MAX_ELAPSED_TIME_MILLIS = 900000;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 60000;
    public static final double DEFAULT_MULTIPLIER = 1.5d;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.5d;
    private int currentIntervalMillis;
    private final int initialIntervalMillis;
    private final int maxElapsedTimeMillis;
    private final int maxIntervalMillis;
    private final double multiplier;
    private final NanoClock nanoClock;
    private final double randomizationFactor;
    long startTimeNanos;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder {
        int initialIntervalMillis = 500;
        double randomizationFactor = 0.5d;
        double multiplier = 1.5d;
        int maxIntervalMillis = 60000;
        int maxElapsedTimeMillis = 900000;
        NanoClock nanoClock = NanoClock.SYSTEM;

        public ExponentialBackOff build() {
            return new ExponentialBackOff(this);
        }

        public final int getInitialIntervalMillis() {
            return this.initialIntervalMillis;
        }

        public final int getMaxElapsedTimeMillis() {
            return this.maxElapsedTimeMillis;
        }

        public final int getMaxIntervalMillis() {
            return this.maxIntervalMillis;
        }

        public final double getMultiplier() {
            return this.multiplier;
        }

        public final NanoClock getNanoClock() {
            return this.nanoClock;
        }

        public final double getRandomizationFactor() {
            return this.randomizationFactor;
        }

        public Builder setInitialIntervalMillis(int i10) {
            this.initialIntervalMillis = i10;
            return this;
        }

        public Builder setMaxElapsedTimeMillis(int i10) {
            this.maxElapsedTimeMillis = i10;
            return this;
        }

        public Builder setMaxIntervalMillis(int i10) {
            this.maxIntervalMillis = i10;
            return this;
        }

        public Builder setMultiplier(double d10) {
            this.multiplier = d10;
            return this;
        }

        public Builder setNanoClock(NanoClock nanoClock) {
            this.nanoClock = (NanoClock) Preconditions.checkNotNull(nanoClock);
            return this;
        }

        public Builder setRandomizationFactor(double d10) {
            this.randomizationFactor = d10;
            return this;
        }
    }

    public ExponentialBackOff() {
        this(new Builder());
    }

    static int getRandomValueFromInterval(double d10, double d11, int i10) {
        double d12 = i10;
        double d13 = d10 * d12;
        double d14 = d12 - d13;
        return (int) (d14 + (d11 * (((d12 + d13) - d14) + 1.0d)));
    }

    private void incrementCurrentInterval() {
        int i10 = this.currentIntervalMillis;
        double d10 = i10;
        int i11 = this.maxIntervalMillis;
        double d11 = this.multiplier;
        if (d10 >= ((double) i11) / d11) {
            this.currentIntervalMillis = i11;
        } else {
            this.currentIntervalMillis = (int) (((double) i10) * d11);
        }
    }

    public final int getCurrentIntervalMillis() {
        return this.currentIntervalMillis;
    }

    public final long getElapsedTimeMillis() {
        return (this.nanoClock.nanoTime() - this.startTimeNanos) / 1000000;
    }

    public final int getInitialIntervalMillis() {
        return this.initialIntervalMillis;
    }

    public final int getMaxElapsedTimeMillis() {
        return this.maxElapsedTimeMillis;
    }

    public final int getMaxIntervalMillis() {
        return this.maxIntervalMillis;
    }

    public final double getMultiplier() {
        return this.multiplier;
    }

    public final double getRandomizationFactor() {
        return this.randomizationFactor;
    }

    @Override // com.google.api.client.util.BackOff
    public long nextBackOffMillis() {
        if (getElapsedTimeMillis() > this.maxElapsedTimeMillis) {
            return -1L;
        }
        int randomValueFromInterval = getRandomValueFromInterval(this.randomizationFactor, Math.random(), this.currentIntervalMillis);
        incrementCurrentInterval();
        return randomValueFromInterval;
    }

    @Override // com.google.api.client.util.BackOff
    public final void reset() {
        this.currentIntervalMillis = this.initialIntervalMillis;
        this.startTimeNanos = this.nanoClock.nanoTime();
    }

    protected ExponentialBackOff(Builder builder) {
        int i10 = builder.initialIntervalMillis;
        this.initialIntervalMillis = i10;
        double d10 = builder.randomizationFactor;
        this.randomizationFactor = d10;
        double d11 = builder.multiplier;
        this.multiplier = d11;
        int i11 = builder.maxIntervalMillis;
        this.maxIntervalMillis = i11;
        int i12 = builder.maxElapsedTimeMillis;
        this.maxElapsedTimeMillis = i12;
        this.nanoClock = builder.nanoClock;
        Preconditions.checkArgument(i10 > 0);
        Preconditions.checkArgument(0.0d <= d10 && d10 < 1.0d);
        Preconditions.checkArgument(d11 >= 1.0d);
        Preconditions.checkArgument(i11 >= i10);
        Preconditions.checkArgument(i12 > 0);
        reset();
    }
}
