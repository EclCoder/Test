/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024006
 * Address  : 00024006
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint * FUN_00024006(uint *param_1)

{
  int *piVar1;
  uint *puVar2;
  uint *puVar3;
  uint uVar4;
  uint uVar5;
  
  uVar5 = *param_1;
  uVar4 = param_1[1];
  piVar1 = (int *)FUN_0001b400();
  puVar2 = param_1 + -10;
  if (uVar4 >> 8 == 0x434c4e && (uVar5 >> 8 | uVar4 << 0x18) == 0x47432b2b) {
    uVar4 = param_1[-3];
    puVar3 = (uint *)*piVar1;
    if ((int)uVar4 < 0) {
      uVar4 = -uVar4;
    }
    param_1[-3] = uVar4 + 1;
    if (puVar2 != puVar3) {
      *piVar1 = (int)puVar2;
      param_1[-4] = (uint)puVar3;
    }
    piVar1[1] = piVar1[1] + -1;
    return (uint *)param_1[9];
  }
  if (*piVar1 != 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b280(piVar1);
  }
  *piVar1 = (int)puVar2;
  return param_1 + 0x16;
}


