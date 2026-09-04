/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000262cc
 * Address  : 000262cc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined8 FUN_000262cc(uint param_1,uint param_2,uint param_3,uint param_4,uint *param_5)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  
  if (param_2 == 0) {
    if (param_4 == 0) {
      uVar11 = FUN_00026070(param_1,param_3,param_3,0,0);
      if (param_5 != (uint *)0x0) {
        *param_5 = param_1 - uVar11 * param_3;
        param_5[1] = 0;
      }
    }
    else {
LAB_0002630a:
      if (param_5 != (uint *)0x0) {
        *param_5 = param_1;
        param_5[1] = param_2;
      }
      uVar11 = 0;
    }
  }
  else {
    uVar11 = param_2;
    if (param_3 != 0) {
      if (param_4 == 0) {
        if ((param_3 & param_3 - 1) == 0) {
          if (param_5 != (uint *)0x0) {
            *param_5 = param_3 - 1 & param_1;
            param_5[1] = 0;
          }
          if (param_3 != 1) {
            bVar2 = (byte)param_3;
            bVar3 = (byte)(param_3 >> 8);
            bVar4 = (byte)(param_3 >> 0x10);
            bVar1 = (byte)(param_3 >> 0x18);
            uVar11 = LZCOUNT((uint)(byte)((((((((bVar2 & 1) << 1 | bVar2 >> 1 & 1) << 1 |
                                              bVar2 >> 2 & 1) << 1 | bVar2 >> 3 & 1) << 1 |
                                            bVar2 >> 4 & 1) << 1 | bVar2 >> 5 & 1) << 1 |
                                          bVar2 >> 6 & 1) << 1 | bVar2 >> 7) << 0x18 |
                             (uint)(byte)((((((((bVar3 & 1) << 1 | bVar3 >> 1 & 1) << 1 |
                                              bVar3 >> 2 & 1) << 1 | bVar3 >> 3 & 1) << 1 |
                                            bVar3 >> 4 & 1) << 1 | bVar3 >> 5 & 1) << 1 |
                                          bVar3 >> 6 & 1) << 1 | bVar3 >> 7) << 0x10 |
                             (uint)(byte)((((((((bVar4 & 1) << 1 | bVar4 >> 1 & 1) << 1 |
                                              bVar4 >> 2 & 1) << 1 | bVar4 >> 3 & 1) << 1 |
                                            bVar4 >> 4 & 1) << 1 | bVar4 >> 5 & 1) << 1 |
                                          bVar4 >> 6 & 1) << 1 | bVar4 >> 7) << 8 |
                             (uint)(byte)((((((((bVar1 & 1) << 1 | bVar1 >> 1 & 1) << 1 |
                                              bVar1 >> 2 & 1) << 1 | bVar1 >> 3 & 1) << 1 |
                                            bVar1 >> 4 & 1) << 1 | bVar1 >> 5 & 1) << 1 |
                                          bVar1 >> 6 & 1) << 1 | bVar1 >> 7));
            param_1 = param_1 >> (uVar11 & 0x1f) | (param_2 << 1) << (~uVar11 & 0x1f);
            uVar11 = param_2 >> uVar11;
          }
          goto LAB_00026460;
        }
        uVar11 = (LZCOUNT(param_3) - LZCOUNT(param_2)) + 0x21;
        if (uVar11 == 0x20) goto LAB_0002636e;
        if (uVar11 < 0x20) {
          uVar5 = 0x20 - uVar11;
          goto LAB_000263fc;
        }
        uVar6 = (LZCOUNT(param_3) - LZCOUNT(param_2)) + 1;
        uVar10 = param_2 << (0x40 - uVar11 & 0xff) | param_1 >> (uVar6 & 0xff);
        uVar5 = param_1 << (0x40 - uVar11 & 0xff);
        param_2 = param_2 >> (uVar6 & 0xff);
        uVar6 = 0;
      }
      else {
        uVar5 = LZCOUNT(param_4) - LZCOUNT(param_2);
        if (0x1f < uVar5) goto LAB_0002630a;
        uVar11 = uVar5 + 1;
        if (uVar11 == 0x20) {
LAB_0002636e:
          uVar11 = 0x20;
          uVar5 = 0;
          uVar6 = 0;
          uVar10 = param_1;
        }
        else {
LAB_00026346:
          uVar5 = 0x1f - uVar5;
LAB_000263fc:
          uVar6 = param_2 >> (uVar11 & 0xff);
          param_2 = param_2 << (uVar5 & 0xff) | param_1 >> (uVar11 & 0xff);
          uVar10 = param_1 << (uVar5 & 0xff);
          uVar5 = 0;
        }
      }
      uVar7 = 0;
      while (param_1 = uVar7 | uVar5 << 1, uVar11 != 0) {
        uVar8 = uVar6 << 1 | param_2 >> 0x1f;
        uVar9 = param_2 << 1 | uVar10 >> 0x1f;
        uVar11 = uVar11 - 1;
        uVar7 = param_4 + ~uVar8 + (uint)CARRY4(~uVar9,param_3);
        param_2 = uVar9 - param_3;
        uVar6 = (uVar8 - param_4) - (uint)(uVar9 < param_3);
        if (-1 < (int)uVar7) {
          param_2 = uVar9;
          uVar6 = uVar8;
        }
        uVar7 = uVar7 >> 0x1f;
        uVar10 = uVar10 << 1 | uVar5 >> 0x1f;
        uVar5 = param_1;
      }
      uVar11 = uVar5 >> 0x1f | uVar10 << 1;
      if (param_5 != (uint *)0x0) {
        *param_5 = param_2;
        param_5[1] = uVar6;
      }
      goto LAB_00026460;
    }
    if (param_4 == 0) goto LAB_00026460;
    if (param_1 == 0) {
      uVar11 = FUN_00026070(param_2,param_4,0,param_4,param_4);
      if (param_5 != (uint *)0x0) {
        *param_5 = 0;
        param_5[1] = param_2 - uVar11 * param_4;
      }
    }
    else {
      if ((param_4 & param_4 - 1) != 0) {
        uVar5 = LZCOUNT(param_4) - LZCOUNT(param_2);
        if (uVar5 < 0x1f) {
          uVar11 = uVar5 + 1;
          goto LAB_00026346;
        }
        goto LAB_0002630a;
      }
      if (param_5 != (uint *)0x0) {
        *param_5 = param_1;
        param_5[1] = param_4 - 1 & param_2;
      }
      bVar2 = (byte)param_4;
      bVar3 = (byte)(param_4 >> 8);
      bVar4 = (byte)(param_4 >> 0x10);
      bVar1 = (byte)(param_4 >> 0x18);
      uVar11 = param_2 >>
               LZCOUNT((uint)(byte)((((((((bVar2 & 1) << 1 | bVar2 >> 1 & 1) << 1 | bVar2 >> 2 & 1)
                                        << 1 | bVar2 >> 3 & 1) << 1 | bVar2 >> 4 & 1) << 1 |
                                     bVar2 >> 5 & 1) << 1 | bVar2 >> 6 & 1) << 1 | bVar2 >> 7) <<
                       0x18 | (uint)(byte)((((((((bVar3 & 1) << 1 | bVar3 >> 1 & 1) << 1 |
                                               bVar3 >> 2 & 1) << 1 | bVar3 >> 3 & 1) << 1 |
                                             bVar3 >> 4 & 1) << 1 | bVar3 >> 5 & 1) << 1 |
                                           bVar3 >> 6 & 1) << 1 | bVar3 >> 7) << 0x10 |
                       (uint)(byte)((((((((bVar4 & 1) << 1 | bVar4 >> 1 & 1) << 1 | bVar4 >> 2 & 1)
                                        << 1 | bVar4 >> 3 & 1) << 1 | bVar4 >> 4 & 1) << 1 |
                                     bVar4 >> 5 & 1) << 1 | bVar4 >> 6 & 1) << 1 | bVar4 >> 7) << 8
                       | (uint)(byte)((((((((bVar1 & 1) << 1 | bVar1 >> 1 & 1) << 1 | bVar1 >> 2 & 1
                                          ) << 1 | bVar1 >> 3 & 1) << 1 | bVar1 >> 4 & 1) << 1 |
                                       bVar1 >> 5 & 1) << 1 | bVar1 >> 6 & 1) << 1 | bVar1 >> 7));
    }
  }
  param_1 = uVar11;
  uVar11 = 0;
LAB_00026460:
  return CONCAT44(uVar11,param_1);
}


