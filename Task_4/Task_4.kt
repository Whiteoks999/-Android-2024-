fun main() {
	val subscriber_1 = Subscriber()
    val subscriber_2 = Subscriber()
    val newsPoster:Subscriptionable = NewsPoster()
    newsPoster.addSubscriber(subscriber_1)
    newsPoster.addSubscriber(subscriber_2)
    newsPoster.addContent("Santa Claus exists!")
    newsPoster.addContent("Who turned on winter in May?")
}

interface Subscriptionable {
    fun addSubscriber(subscriber:Subscriber)
    fun notifySubscriber()
    fun addContent(content:String)
}

class Subscriber {

    fun getContent(content: String) {
       println(content)
    }
}

class NewsPoster:Subscriptionable{
    private var listSubscriber = ArrayList<Subscriber>()
    private var listNews = ArrayList<String>()
 
    override fun addSubscriber(subscriber:Subscriber){
        listSubscriber.add(subscriber)
    }
 
    private fun addNews(news:String){
        listNews.add(news)
        notifySubscriber()
    }
 
    override fun notifySubscriber(){
        for (sub in listSubscriber){
            sub.getContent(listNews[listNews.size-1])
        }
    }
 
    override fun addContent(content: String) {
        addNews(content)
    }
}