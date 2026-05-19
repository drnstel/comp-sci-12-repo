import requests

def download_word_list():
    """
    Downloads a list of 10,000 words.

    Args:
        None.

    Returns:
        list of str: The list of 10,000 words.
    """
    response = requests.get("https://www.mit.edu/~ecprice/wordlist.10000")
    downloaded_words = response.content.splitlines()
    
    word_list = []
    for word in downloaded_words:
        word_list.append(word.decode('UTF-8'))
    
    return word_list