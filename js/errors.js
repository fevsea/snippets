try {
  throw new Error('oops');
} catch (ex) {
  console.error('inner', ex.message);
} finally {
  console.log('finally');
}
