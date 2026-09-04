/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025d04
 * Address  : 00025d04
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint * FUN_00025d04(undefined4 *param_1,uint param_2)

{
  uint *puVar1;
  uint uVar2;
  ushort *puVar3;
  ushort *local_1c;
  
  if (param_2 == 0xff) {
    return (uint *)0x0;
  }
  puVar3 = (ushort *)*param_1;
  local_1c = puVar3;
  switch(param_2 & 0xf) {
  case 0:
  case 3:
  case 0xb:
    local_1c = puVar3 + 2;
    puVar1 = *(uint **)puVar3;
    break;
  case 1:
    puVar1 = (uint *)FUN_00025d9e(&local_1c);
    break;
  case 2:
    local_1c = puVar3 + 1;
    puVar1 = (uint *)(uint)*puVar3;
    break;
  case 4:
  case 0xc:
    local_1c = puVar3 + 4;
    puVar1 = *(uint **)puVar3;
    break;
  default:
                    /* WARNING: Subroutine does not return */
    abort();
  case 9:
    puVar1 = (uint *)FUN_00025e0c(&local_1c);
    break;
  case 10:
    local_1c = puVar3 + 1;
    puVar1 = (uint *)(int)(short)*puVar3;
  }
  uVar2 = (param_2 & 0x7f) >> 4;
  if ((uVar2 == 0) || (uVar2 == 3)) {
LAB_00025d6a:
    if (puVar1 != (uint *)0x0) {
      if (0x7fffffff < (uint)(int)(char)param_2) {
        puVar1 = (uint *)*puVar1;
      }
      goto LAB_00025d7a;
    }
  }
  else {
    if (uVar2 != 1) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if (puVar1 != (uint *)0x0) {
      puVar1 = (uint *)((int)puVar1 + (int)puVar3);
      goto LAB_00025d6a;
    }
  }
  puVar1 = (uint *)0x0;
LAB_00025d7a:
  *param_1 = local_1c;
  return puVar1;
}


