/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000256e0
 * Address  : 000256e0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


ushort * FUN_000256e0(uint param_1)

{
  int iVar1;
  int iVar2;
  ushort *puVar3;
  ushort *puVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  undefined4 unaff_r6;
  ushort *puVar9;
  pthread_mutex_t *local_24;
  
  if (param_1 < 2) {
    param_1 = 1;
  }
  puVar3 = (ushort *)FUN_00023f80(0x10,param_1);
  iVar1 = DAT_000257e4;
  if (puVar3 != (ushort *)0x0) {
    return puVar3;
  }
  local_24 = (pthread_mutex_t *)(DAT_000257e4 + 0x25714);
  pthread_mutex_lock(local_24);
  iVar2 = DAT_000257e8;
  puVar3 = *(ushort **)(iVar1 + 0x25718);
  iVar8 = DAT_000257e8 + 0x25726;
  if (puVar3 == (ushort *)0x0) {
    puVar3 = (ushort *)(DAT_000257e8 + 0x25732);
    *(undefined4 *)puVar3 = DAT_000257e0;
    *(ushort **)(iVar1 + 0x25718) = puVar3;
  }
  uVar5 = (param_1 + 3 >> 2) + 1;
  puVar9 = (ushort *)0x0;
  do {
    puVar4 = puVar3;
    if (puVar4 == (ushort *)(&UNK_00025926 + iVar2)) {
      puVar3 = (ushort *)0x0;
LAB_000257b4:
      FUN_000258cc(&local_24);
      return puVar3;
    }
    puVar3 = puVar4 + 2;
    if (((uint)puVar3 & 0xf) != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b568(DAT_000257ec + 0x257ce,DAT_000257f0 + 0x257d0,0x92,DAT_000257f4 + 0x257d2,
                   unaff_r6);
    }
    uVar6 = (uint)puVar4[1];
    uVar7 = uVar5;
    if (uVar5 <= uVar6 && uVar6 - uVar5 != 0) {
      uVar7 = uVar5 + (uVar6 - uVar5 & 3);
    }
    if (uVar7 < uVar6) {
      uVar5 = uVar6 - uVar7 & 0xffff;
      puVar4[1] = (ushort)(uVar6 - uVar7);
      puVar4[uVar5 * 2] = 0;
      puVar3 = puVar4 + uVar5 * 2 + 2;
      puVar4[uVar5 * 2 + 1] = (ushort)uVar7;
      if (((uint)puVar3 & 0xf) != 0) {
                    /* WARNING: Subroutine does not return */
        FUN_0001b568(DAT_000257f8 + 0x25796,DAT_000257fc + 0x25798,0xa7,DAT_00025800 + 0x2579a,
                     unaff_r6);
      }
      goto LAB_000257b4;
    }
    if (param_1 + 3 >> 2 < uVar6) {
      if (puVar9 == (ushort *)0x0) {
        *(uint *)(iVar1 + 0x25718) = iVar8 + (uint)*puVar4 * 4;
      }
      else {
        *puVar9 = *puVar4;
      }
      *puVar4 = 0;
      goto LAB_000257b4;
    }
    puVar3 = (ushort *)(iVar8 + (uint)*puVar4 * 4);
    puVar9 = puVar4;
  } while( true );
}


