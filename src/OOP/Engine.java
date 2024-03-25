package OOP;

public interface Engine {
// bir interface' e tanımlanan tüm metodlar default olarak publictir.
// interface' in amacı bir classın bu metodları implement edeceğini garanti etmek,
// ve herkes tarafından erişilebilir olması
	void start();

	void stop();

}
// engine'ler obje olarak üretilemez